package fr.isen.naze.services.impl;

import fr.isen.naze.models.Company;
import fr.isen.naze.models.Project;
import fr.isen.naze.services.CompanyService;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class CompanyServiceImpl implements CompanyService {

    @Override
    public Company getCompany() {
        return Company.findById(0);
    } //renvoie le premier élément Company de la BDD

    @Override
    public List<Project> getProjects() {
        return Project.listAll();
    } //Renvoie tous les Projets de la BDD
}
