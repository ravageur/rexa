package fr.ravageur.rexa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dish")
public class Dish
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    public Dish(String name)
    {
        this.name = name;
    }

    /**
     * Allow to get the name of this dish.
     * 
     * @return The name of this dish.
     */
    public String geName()
    {
        return this.name;
    }
}
