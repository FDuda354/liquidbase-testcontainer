package net.dudios.liquidbasetestcontainer.user;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class PersonController {

    private final PersonRepo personRepo;

    @RequestMapping("/all")
    public Iterable<Person> getAllUsers() {
        return personRepo.findAll();
    }
}
