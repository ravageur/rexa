package fr.ravageur.rexa.repository;

import org.springframework.data.repository.CrudRepository;

import fr.ravageur.rexa.entities.Dish;

public interface DishRepository extends CrudRepository<Dish, Integer>
{
    
}
