package fr.ravageur.rexa.repository;

import org.springframework.data.repository.CrudRepository;

import fr.ravageur.rexa.entities.Event;

public interface EventRepository extends CrudRepository<Event, Integer>
{
    
}
