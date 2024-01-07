package fr.isen.naze.services;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.isen.naze.models.ServiceLevel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@objid ("abee1db1-b932-4245-a356-124e735731f0")
//création de l'interface ServiceLevel
public interface ServiceLevelService {
    @objid ("8dc68944-5e16-41aa-b92f-5119bad95ec8")
    List<ServiceLevel> getServiceLevels();

}
