package fr.isen.naze.models;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@objid ("7ad7c888-1148-4478-a385-226cef9079dd")
@Entity
public class Company {
    @mdl.prop
    @objid ("eb29e5d4-07f8-477d-9079-9a07af9259e4")
    @Id
    public int id_company;

    @mdl.prop
    @objid ("19902fd9-0ec7-43f9-9d0d-0b5ec7719eb9")
    public String name;

    @mdl.prop
    @objid ("885687e1-9350-48e6-8aa8-859adaaa6099")
    public String sector;

}
