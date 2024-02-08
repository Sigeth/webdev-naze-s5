package fr.isen.naze.models;

import fr.isen.naze.models.enums.enum_day;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//Initialisation de la classe Availability
public class Availability extends PanacheEntityBase {
    @Id
    public int id_day;

    public boolean morning;

    public boolean afternoon;

    public enum_day day;

}
