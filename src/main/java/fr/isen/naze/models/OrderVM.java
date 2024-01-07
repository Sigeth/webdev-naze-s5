package fr.isen.naze.models;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.isen.naze.models.enums.enum_license;
import fr.isen.naze.models.enums.enum_location;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@objid ("d364721f-7646-4452-bf5a-17e0c7c700d4")
@Entity
//Initialisation de la classe OrderVM
public class OrderVM extends PanacheEntityBase {
    @mdl.prop
    @objid ("f85b2365-bc1d-480e-91c3-b58b8ad60cdd")
    @Id
    public int id_order;

    @mdl.prop
    @objid ("9a422668-413a-4088-87c9-293b49ccf651")
    public String solution_name;

    @mdl.prop
    @objid ("e0ecbc41-e2df-476f-85e8-f34aec91c9e5")
    public String solution_description;

    @mdl.prop
    @objid ("21ef8ed9-1e63-4abf-aafe-c25eefdecf91")
    public enum_location location;

    @mdl.prop
    @objid ("ae60668b-281c-49b0-a3c3-8174189ab15f")
    public enum_license license;

    @mdl.prop
    @objid ("884f5669-4e21-42aa-8f99-35967f714f69")
    @OneToOne(cascade = CascadeType.ALL)
    public Project project_order;

    @mdl.prop
    @objid ("9af087ff-0b8a-407f-853d-0184a69b8095")
    @OneToOne(cascade = CascadeType.ALL)
    public Contact contact_order;

    @mdl.prop
    @objid ("6a20c4c5-7df1-40b8-8777-24dd478a127b")
    @OneToOne(cascade = CascadeType.ALL)
    public ServiceLevel service_order;

    @mdl.prop
    @objid ("430a98dd-09cf-4ee8-9590-661c80d12da3")
    public float price;

    @mdl.prop
    @objid ("4b0895a3-ae8b-4fed-8657-26825088d6b7")
    public float carbon;


}
