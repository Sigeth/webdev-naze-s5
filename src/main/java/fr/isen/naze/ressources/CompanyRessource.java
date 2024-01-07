package fr.isen.naze.ressources;

import fr.isen.naze.models.Company;
import fr.isen.naze.models.Project;
import fr.isen.naze.services.impl.CompanyServiceImpl;
import jakarta.inject.Inject;
import jakarta.persistence.criteria.Order;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/company") //déclaration du path de la classe
@Produces(MediaType.APPLICATION_JSON)
public class CompanyRessource {
    @Inject
    CompanyServiceImpl companyService; //Initialisation de companyService qui fera le lien avec la BDD généré automatiquement

    public CompanyRessource() {
        this.companyService = new CompanyServiceImpl();
    }

    @GET
    public Company getCompany() {
        return this.companyService.getCompany();
    } //Appel de la fonction getCompnay overwrite dans companyService

    @Path("/project")
    @GET
    public List<Project> getProjects() {
        return  this.companyService.getProjects();
    }
//Appel de la fonction getProjects overwrite dans companyService
}
