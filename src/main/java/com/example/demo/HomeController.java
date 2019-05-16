package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/")
    public String index(Model model) {
        //Create a person
        Person person = new Person();
        person.setName("Stephon Bullock");
        person.setSsn("555-12-1234");

        //Create a passport
        Passport passport = new Passport();
        passport.setExpDate("05/20/2025");
        passport.setPassportNumber("789756556");

        //add passport to person
        person.setPassport(passport);

        //save person to database
        personRepository.save(person);

        //Grab all person from database and send to template
        model.addAttribute("persons", personRepository.findAll());
        return "index";

    }
}
