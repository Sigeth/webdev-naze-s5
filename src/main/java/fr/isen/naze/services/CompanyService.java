package fr.isen.naze.services;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.isen.naze.models.Company;
import fr.isen.naze.models.Project;

@objid ("9dce3046-5cd6-466d-a925-4a1b5df98dc1")
public interface CompanyService {
    @objid ("c39b6536-5ee2-4fa5-b7f1-474665b25667")
    Company getCompany();

    @objid ("c688e706-cc95-4baf-a5ab-367ec6069eb2")
    List<Project> getProjects();

}
