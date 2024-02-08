package fr.isen.naze.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
//Initialisation de la classe Project
public class Project extends PanacheEntityBase {
    @Id
    public int id_project;

    public String name;

    @ManyToOne(cascade = CascadeType.ALL)
    public Folder folder_project;

}
