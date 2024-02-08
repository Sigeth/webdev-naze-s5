package fr.isen.naze.models;

import fr.isen.naze.models.enums.enum_service_level;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//Initialisation de la classe ServiceLevel
public class ServiceLevel extends PanacheEntityBase {
    @Id
    public int id_service;

    public enum_service_level name;

    public float price;

    public float carbon;

}
