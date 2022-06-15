package fr.ravageur.rexa.repository;

import org.springframework.data.repository.CrudRepository;

import fr.ravageur.rexa.entities.Guest;

public interface GuestRepository extends CrudRepository<Guest, Integer>
{

}
