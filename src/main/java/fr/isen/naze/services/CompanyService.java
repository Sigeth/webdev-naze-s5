package fr.isen.naze.services;

import java.util.List;
import fr.isen.naze.models.Company;
import fr.isen.naze.models.Project;
//création de l'interface CompanyService
public interface CompanyService {
    Company getCompany();

    List<Project> getProjects();

}
