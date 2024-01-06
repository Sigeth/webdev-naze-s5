package fr.isen.naze.models;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;

@objid ("0000b479-aae6-4f73-9054-c1ff77207900")
@Entity
public class Contact extends PanacheEntityBase {
    @mdl.prop
    @objid ("e3f678fa-1ba6-44bc-8ddd-6f5b3fd83290")
    @Id
    public int id_contact;

    @mdl.prop
    @objid ("3fa9ee48-3112-4e34-b1ff-7b0ca3d8709a")
    public String last_name;

    @mdl.prop
    @objid ("a8defa8c-92db-4429-84d4-ca7e5935154c")
    public String first_name;

    @mdl.prop
    @objid ("a33f372f-0ca5-46da-af37-e7ba240a50fa")
    public String email;

    @mdl.prop
    @objid ("a6b360b8-5d0b-43eb-a62a-56d09a9af886")
    public String phone;

    @mdl.prop
    @objid ("c3a9fc6a-2c67-4f72-9836-2c70258cb32c")
    public String address;

    @mdl.prop
    @objid ("23a381cc-795a-49dc-8daa-03bbf6be0d24")
    public int post_code;

    @mdl.prop
    @objid ("42f47861-23e0-4036-b99e-5f5ae38989f4")
    public String city;

    @mdl.prop
    @objid ("56bea135-f20b-4744-b877-5c93ba24efd1")
    public String country;

    @mdl.prop
    @objid ("0f9fde1d-410c-49be-98ce-1b31a8a38b88")
    @OneToMany
    public List<Availability> availabilities;

}
