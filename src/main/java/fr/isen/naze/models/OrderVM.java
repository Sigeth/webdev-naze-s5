package fr.isen.naze.models;

import fr.isen.naze.models.enums.enum_license;
import fr.isen.naze.models.enums.enum_location;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
//Initialisation de la classe OrderVM
public class OrderVM extends PanacheEntityBase {
    @Id
    public int id_order;

    public String solution_name;

    public String solution_description;

    public enum_location location;

    public enum_license license;

    @OneToOne(cascade = CascadeType.ALL)
    public Project project_order;

    @OneToOne(cascade = CascadeType.ALL)
    public Contact contact_order;

    @OneToOne(cascade = CascadeType.ALL)
    public ServiceLevel service_order;

    public float price;

    public float carbon;


}
