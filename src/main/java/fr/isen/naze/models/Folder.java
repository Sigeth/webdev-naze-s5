package fr.isen.naze.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
//Initialisation de la classe Folder
public class Folder extends PanacheEntityBase {
    @Id
    public int id_folder;

    public String name;

    @ManyToOne(cascade = CascadeType.ALL)
    public Company company_folder;

}
