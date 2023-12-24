package fr.isen.naze.models;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.isen.naze.models.enums.enum_service_level;

@objid ("cb4b5baf-5a40-4382-83f1-17af957db798")
public class ServiceLevel {
    @mdl.prop
    @objid ("9d543c2f-23af-4dbc-9cef-f036e30b5dee")
    private int id_service;

    @mdl.prop
    @objid ("16605ad8-8128-498b-b6b5-79981519d53e")
    private enum_service_level name;

    @mdl.prop
    @objid ("3905ff3c-c57a-4720-a1bd-82e402d4b9d8")
    private int price;

}
