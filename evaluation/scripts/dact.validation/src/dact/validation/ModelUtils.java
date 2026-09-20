package dact.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ModelUtils {

    /**
     * Recursively sorts all containment collections in the EObject tree.
     */
    public static void sortModelTree(EObject root) {
        if (root == null) return;

        // Iterate through all containment features on the EObject
        for (EStructuralFeature feature : root.eClass().getEAllStructuralFeatures()) {
            if (feature.isMany() && feature.isChangeable()) {
                Object value = root.eGet(feature);
                if (value instanceof EList) {
                    @SuppressWarnings("unchecked")
                    EList<Object> list = (EList<Object>) value;
                    
                    // Sort the collection using a deterministic key (e.g., name or class name)
                    list.sort((o1, o2) -> {
                        if (o1 instanceof EObject && o2 instanceof EObject) {
                            return compareEObjects((EObject) o1, (EObject) o2);
                        }
                        return 0;
                    });
                }
            }
        }

        // Recursively sort children
        for (EObject child : root.eContents()) {
            sortModelTree(child);
        }
    }

    private static int compareEObjects(EObject e1, EObject e2) {
        // Compare by class name first
        int typeCompare = e1.eClass().getName().compareTo(e2.eClass().getName());
        if (typeCompare != 0) return typeCompare;

        // Compare by 'name' attribute if present
        EStructuralFeature nameAttr1 = e1.eClass().getEStructuralFeature("name");
        EStructuralFeature nameAttr2 = e2.eClass().getEStructuralFeature("name");

        if (nameAttr1 != null && nameAttr2 != null) {
            String name1 = (String) e1.eGet(nameAttr1);
            String name2 = (String) e2.eGet(nameAttr2);
            if (name1 != null && name2 != null) {
                return name1.compareTo(name2);
            }
        }

        return 0;
    }
}