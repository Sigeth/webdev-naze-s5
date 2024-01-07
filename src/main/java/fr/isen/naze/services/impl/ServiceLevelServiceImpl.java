package fr.isen.naze.services.impl;

import fr.isen.naze.models.ServiceLevel;
import fr.isen.naze.services.ServiceLevelService;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class ServiceLevelServiceImpl implements ServiceLevelService {
    @Override
    public List<ServiceLevel> getServiceLevels() {
        return ServiceLevel.listAll();
    } //renvoie tous les Services levels de la BDD
}
