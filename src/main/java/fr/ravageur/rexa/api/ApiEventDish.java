package fr.ravageur.rexa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.ravageur.rexa.entities.EventDish;
import fr.ravageur.rexa.repository.EventDishRepository;

@RestController
public class ApiEventDish
{
    private final String MAIN_PATH = "/api/eventDish";

    @Autowired
    private EventDishRepository eventDishRepository;

    @GetMapping(path = MAIN_PATH + "/get")
    public @ResponseBody EventDish get(@RequestParam int id) 
    {
        return this.eventDishRepository.findById(id).get();
    }

    @GetMapping(path = MAIN_PATH + "/getAll")
    public @ResponseBody Iterable<EventDish> getAll()
    {
        return this.eventDishRepository.findAll();
    }

    @PostMapping(path = MAIN_PATH + "/add")
    public @ResponseBody boolean post(@RequestParam EventDish eventDish)
    {
        this.eventDishRepository.save(eventDish);

        return true;
    }

    @DeleteMapping(path = MAIN_PATH + "/delete")
    public @ResponseBody boolean delete(@RequestParam int id)
    {
        this.eventDishRepository.deleteById(id);

        return true;
    }
}
