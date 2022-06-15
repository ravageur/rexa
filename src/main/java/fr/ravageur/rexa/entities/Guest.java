package fr.ravageur.rexa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Guest")
public class Guest 
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false, length = 127)
    private String name;

    @Column(name = "first_name", nullable = false, length = 127)
    private String firstName;

    @ManyToOne
    @JoinColumn(name = "dish", referencedColumnName = "id")
    private Dish dish;

    public Guest(String name, String firstName)
    {
        this.name = name;
        this.name = firstName;
    }

    /**
     * Allow to get the name from this guest.
     * 
     * @return The name from this guest.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Allow to get the first name from this guest.
     * 
     * @return The first name from this guest.
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Allow to get the chose dish from this guest.
     * 
     * @return The chose dish by this guest. Return null if this guest hasn't chose any dish.
     */
    public Dish getDish()
    {
        return this.dish;
    }

    /**
     * Allow to set the dish for this guest.
     * 
     * @param dish
     */
    public void setDish(Dish dish)
    {
        this.dish = dish;
    }
}
