package fr.isen.naze.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;

@Entity
//Initialisation de la classe Contact
public class Contact extends PanacheEntityBase {
    @Id
    public int id_contact;

    public String last_name;

    public String first_name;

    public String email;

    public String phone;

    public String address;

    public int post_code;

    public String city;

    public String country;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Availability> availabilities;

}
