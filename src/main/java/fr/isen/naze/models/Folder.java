package fr.isen.naze.models;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@objid ("fa241b9e-0eeb-49be-813c-af70aff1fca8")
@Entity
public class Folder extends PanacheEntityBase {
    @mdl.prop
    @objid ("82abbe73-c9f4-4caf-beb7-e9938e0a4816")
    @Id
    public int id_folder;

    @mdl.prop
    @objid ("e4921431-9186-4a97-8c4f-819b242e109d")
    public String name;

    @mdl.prop
    @objid ("79f7a8e6-c4d0-4d25-8835-19021f56b92b")
    @ManyToOne
    public Company company_folder;

}
