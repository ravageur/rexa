package fr.ravageur.rexa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.ravageur.rexa.entities.Event;
import fr.ravageur.rexa.repository.EventRepository;

@RestController
public class ApiEvent 
{
    private final String MAIN_PATH = "/api/event";

    @Autowired
    private EventRepository eventRepository;

    @GetMapping(path = MAIN_PATH + "/get")
    public @ResponseBody Event get(@RequestParam int id) 
    {
        return this.eventRepository.findById(id).get();
    }

    @GetMapping(path = MAIN_PATH + "/getAll")
    public @ResponseBody Iterable<Event> getAll()
    {
        return this.eventRepository.findAll();
    }

    @PostMapping(path = MAIN_PATH + "/add")
    public @ResponseBody boolean post(@RequestParam Event event)
    {
        this.eventRepository.save(event);

        return true;
    }

    @DeleteMapping(path = MAIN_PATH + "/delete")
    public @ResponseBody boolean delete(@RequestParam int id)
    {
        this.eventRepository.deleteById(id);

        return true;
    }
}
