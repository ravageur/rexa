package fr.ravageur.rexa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Event")
public class Event 
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany
    @JoinColumn(name = "guests", referencedColumnName = "id")
    private List<Guest> guests = new ArrayList<>();

    public Event(String name)
    {
        this.name = name;
    }

    /**
     * Allow to get the identifiant of this event.
     * 
     * @return The identifiant of this event.
     */
    public int getId()
    {
        return this.id;
    }

    /**
     * Allow to get the name of this event.
     * 
     * @return The name of this event.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Allow to add a guest to this event.
     * 
     * @param guest
     * 
     * @return True if the operation was sucessfull. Otherwise false when it is a failure.
     */
    public boolean addGuest(Guest guest)
    {
        return this.guests.add(guest);
    }

    /**
     * Allow to remove a guest from this event.
     * 
     * @param guest
     * 
     * @return True if the operation was sucessfull. Otherwise false when it is a failure.
     */
    public boolean removeGuest(Guest guest)
    {
        return this.guests.remove(guest);
    }
}
