package fr.ravageur.rexa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.ravageur.rexa.entities.Dish;
import fr.ravageur.rexa.repository.DishRepository;

@RestController
public class ApiDish 
{
    private final String MAIN_PATH = "/api/dish";

    @Autowired
    private DishRepository dishRepository;

    @GetMapping(path = MAIN_PATH + "/get")
    public @ResponseBody Dish get(@RequestParam int id) 
    {
        return this.dishRepository.findById(id).get();
    }

    @GetMapping(path = MAIN_PATH + "/getAll")
    public @ResponseBody Iterable<Dish> getAll()
    {
        return this.dishRepository.findAll();
    }

    @PostMapping(path = MAIN_PATH + "/add")
    public @ResponseBody boolean post(@RequestParam Dish dish)
    {
        this.dishRepository.save(dish);

        return true;
    }

    @DeleteMapping(path = MAIN_PATH + "/delete")
    public @ResponseBody boolean delete(@RequestParam int id)
    {
        this.dishRepository.deleteById(id);

        return true;
    }
}
