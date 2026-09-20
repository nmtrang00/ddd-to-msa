package dact.code.generator.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ResourceUtils {

    public List<EObject> getAllResourceSetRoots(EObject element) {
        List<EObject> roots = new ArrayList<>();
        if (element != null && element.eResource() != null) {

            // 1. Resolve all proxies so cross-referenced files (data/service) are loaded on-demand
            EcoreUtil.resolveAll(element.eResource().getResourceSet());

            // 2. Now collect roots from all loaded resources
            ResourceSet resourceSet = element.eResource().getResourceSet();
            if (resourceSet != null) {
                for (Resource resource : resourceSet.getResources()) {
                    roots.addAll(resource.getContents());
                }
            }
        }
        return roots;
    }
}