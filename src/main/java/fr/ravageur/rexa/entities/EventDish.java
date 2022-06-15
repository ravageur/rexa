package fr.ravageur.rexa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EventDish")
public class EventDish
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "event", referencedColumnName = "id")
    private Event event;

    @OneToMany
    @JoinColumn(name = "dishs", referencedColumnName = "id")
    private List<Dish> dishs = new ArrayList<>();

    public EventDish(String name) 
    {
        event = new Event(name);
    }

    public Event getEvent()
    {
        return this.event;
    }

    public void setEvent(Event event)
    {
        this.event = event;
    }

    /**
     * Allow to add a guest to this event.
     * 
     * @param guest
     * 
     * @return True if the operation was sucessfull. Otherwise false when it is a failure.
     */
    public boolean addDish(Dish dish)
    {
        return this.dishs.add(dish);
    }

    /**
     * Allow to remove a guest from this event.
     * 
     * @param guest
     * 
     * @return True if the operation was sucessfull. Otherwise false when it is a failure.
     */
    public boolean removeDish(Dish dish)
    {
        return this.dishs.remove(dish);
    }
}
