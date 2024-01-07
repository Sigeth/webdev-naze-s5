package fr.isen.naze.models;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.isen.naze.models.enums.enum_service_level;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@objid ("cb4b5baf-5a40-4382-83f1-17af957db798")
@Entity
//Initialisation de la classe ServiceLevel
public class ServiceLevel extends PanacheEntityBase {
    @mdl.prop
    @objid ("9d543c2f-23af-4dbc-9cef-f036e30b5dee")
    @Id
    public int id_service;

    @mdl.prop
    @objid ("16605ad8-8128-498b-b6b5-79981519d53e")
    public enum_service_level name;

    @mdl.prop
    @objid ("3905ff3c-c57a-4720-a1bd-82e402d4b9d8")
    public float price;


    @mdl.prop
    @objid ("5067382f-2b88-4ed3-a840-4c2f81eff755")
    public float carbon;

}
