package fr.ravageur.rexa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.ravageur.rexa.entities.Guest;
import fr.ravageur.rexa.repository.GuestRepository;

@RestController
public class ApiGuest
{
    private final String MAIN_PATH = "/api/guest";

    @Autowired
    private GuestRepository guestRepository;

    @GetMapping(path = MAIN_PATH + "/get")
    public @ResponseBody Guest get(@RequestParam int id) 
    {
        return this.guestRepository.findById(id).get();
    }

    @GetMapping(path = MAIN_PATH + "/getAll")
    public @ResponseBody Iterable<Guest> getAll()
    {
        return this.guestRepository.findAll();
    }

    @PostMapping(path = MAIN_PATH + "/add")
    public @ResponseBody boolean post(@RequestParam Guest guest)
    {
        this.guestRepository.save(guest);

        return true;
    }

    @DeleteMapping(path = MAIN_PATH + "/delete")
    public @ResponseBody boolean delete(@RequestParam int id)
    {
        this.guestRepository.deleteById(id);

        return true;
    }
}
