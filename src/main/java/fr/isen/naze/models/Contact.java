package fr.isen.naze.models;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0000b479-aae6-4f73-9054-c1ff77207900")
public class Contact {
    @mdl.prop
    @objid ("e3f678fa-1ba6-44bc-8ddd-6f5b3fd83290")
    private int id_contact;

    @mdl.prop
    @objid ("3fa9ee48-3112-4e34-b1ff-7b0ca3d8709a")
    private String last_name;

    @mdl.prop
    @objid ("a8defa8c-92db-4429-84d4-ca7e5935154c")
    private String first_name;

    @mdl.prop
    @objid ("a33f372f-0ca5-46da-af37-e7ba240a50fa")
    private String email;

    @mdl.prop
    @objid ("a6b360b8-5d0b-43eb-a62a-56d09a9af886")
    private String phone;

    @mdl.prop
    @objid ("c3a9fc6a-2c67-4f72-9836-2c70258cb32c")
    private String address;

    @mdl.prop
    @objid ("23a381cc-795a-49dc-8daa-03bbf6be0d24")
    private int post_code;

    @mdl.prop
    @objid ("42f47861-23e0-4036-b99e-5f5ae38989f4")
    private String city;

    @mdl.prop
    @objid ("56bea135-f20b-4744-b877-5c93ba24efd1")
    private String country;

    @mdl.prop
    @objid ("0f9fde1d-410c-49be-98ce-1b31a8a38b88")
    private availability availabilities;

}
