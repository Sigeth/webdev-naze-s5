package fr.isen.naze.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//Initialisation de la classe Company
public class Company extends PanacheEntityBase {
    @Id
    public int id_company;

    public String name;

    public String sector;

}
