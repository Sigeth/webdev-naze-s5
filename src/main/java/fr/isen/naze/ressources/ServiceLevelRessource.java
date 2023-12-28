package fr.isen.naze.ressources;

import fr.isen.naze.models.ServiceLevel;
import fr.isen.naze.services.impl.ServiceLevelServiceImpl;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/servicelevel")
@Produces(MediaType.APPLICATION_JSON)
public class ServiceLevelRessource {
    @Inject
    ServiceLevelServiceImpl slService;
    public ServiceLevelRessource() {
        this.slService = new ServiceLevelServiceImpl();
    }

    @GET
    public List<ServiceLevel> getServiceLevels() {
        List<ServiceLevel> result = this.slService.getServiceLevels();
        System.out.println(result);
        return result;
    }

}