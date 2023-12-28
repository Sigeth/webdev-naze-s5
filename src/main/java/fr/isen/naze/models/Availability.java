package fr.isen.naze.models;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.isen.naze.models.enums.enum_day;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@objid ("9471442d-85d5-4599-ad46-639667db4520")
@Entity
public class Availability extends PanacheEntityBase {
    @mdl.prop
    @objid ("f5e85c2b-6692-47e3-9957-360f396023dc")
    @Id
    public int id_day;

    @mdl.prop
    @objid ("cd38ad65-fe47-4954-a032-be58177afdee")
    public boolean morning;

    @mdl.prop
    @objid ("79a7176d-6c25-4aed-b10c-9e2153f1087d")
    public boolean afternoon;

    @mdl.prop
    @objid ("77cec18e-39aa-4798-aec3-faf737be7806")
    public enum_day day;

}
