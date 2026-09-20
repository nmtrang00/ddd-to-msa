package dact.design;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.DDiagram;

import dact.ActivityModel;
import dact.Activity;

public class ImportServices{
	private static final String ANNOTATION_SOURCE = "visible_elements";

	
	public List<EObject> getAvailableActivityCandidates(ActivityModel model) {
	    // 1. Get the root container (same reliable pattern as working method)
	    EObject root = EcoreUtil.getRootContainer(model);
	    
	    // 2. Safely find the active Sirius DDiagram from the model object
	    DDiagram diagram = null;
	    ECrossReferenceAdapter adapter = ECrossReferenceAdapter.getCrossReferenceAdapter(root);
	    if (adapter != null) {
	        for (Setting setting : adapter.getInverseReferences(root)) {
	            if (setting.getEObject() instanceof DDiagram) {
	                diagram = (DDiagram) setting.getEObject();
	                break;
	            }
	        }
	    }

	    // 3. Collect non-imported activities
	    EAnnotation anno = getOrCreateAnnotation(diagram, false);
	    List<EObject> currentRefs = (anno != null) ? anno.getReferences() : Collections.emptyList();

	    Iterable<EObject> iterable = () -> EcoreUtil.getAllContents(root, true);
	    
	    return StreamSupport.stream(iterable.spliterator(), false)
	            .filter(Activity.class::isInstance)
	            .filter(e -> !currentRefs.contains(e))
	            .collect(Collectors.toList());
	}
	
	public EObject importToDiagram(EObject diagram, Object elements) {
		System.out.println("[DEBUG] Chosen elements:"+ elements);
        if (diagram == null || elements == null) return diagram;

        EAnnotation annotation = getOrCreateAnnotation(diagram, true);
        if (annotation == null) return diagram;

        Collection<?> targetList = (elements instanceof Collection<?>) 
            ? (Collection<?>) elements 
            : Collections.singletonList(elements);

        for (Object obj : targetList) {
            if (obj instanceof EObject && !annotation.getReferences().contains(obj)) {
                annotation.getReferences().add((EObject) obj);
            }
        }
        System.out.println("[DEBUG] Annotation list:"+annotation.getReferences());
        return diagram;
	}

    public DDiagram removeFromDiagram(DDiagram diagram, Object elements) {
        if (diagram == null || elements == null) {
            return diagram;
        }

        EModelElement diagramModelElement = (EModelElement) diagram;
        EAnnotation annotation = diagramModelElement.getEAnnotation(ANNOTATION_SOURCE);
        
        if (annotation != null) {
            if (elements instanceof Collection<?>) {
                annotation.getReferences().removeAll((Collection<?>) elements);
            } else if (elements instanceof EObject) {
                annotation.getReferences().remove(elements);
            }
        }
        
        return diagram;
    }
    
    /**
     * Safely retrieves or creates the EAnnotation on the diagram via EObject reflection.
     */
    private EAnnotation getOrCreateAnnotation(EObject diagramObj, boolean createIfMissing) {
        if (!(diagramObj instanceof EModelElement)) {
            return null;
        }

        EModelElement modelElement = (EModelElement) diagramObj;
        List<EAnnotation> annotations = modelElement.getEAnnotations();

        for (EAnnotation anno : annotations) {
            if (ANNOTATION_SOURCE.equals(anno.getSource())) {
                return anno;
            }
        }

        if (createIfMissing) {
            EAnnotation newAnno = EcoreFactory.eINSTANCE.createEAnnotation();
            newAnno.setSource(ANNOTATION_SOURCE);
            annotations.add(newAnno);
            return newAnno;
        }

        return null;
    }
}