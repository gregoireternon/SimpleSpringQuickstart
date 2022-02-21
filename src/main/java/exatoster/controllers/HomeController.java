package exatoster.controllers;

import exatoster.service.IAgeComputer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    private Logger logger = LogManager.getLogger(HomeController.class);

    @Autowired
    IAgeComputer _ageComputer;

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name, ModelMap model) {
        String greet = "Hello!!! " + name + " How are You?";
        logger.info(greet);
        return greet;
    }

    @GetMapping("/age/{birthday}")
    public int age(@PathVariable int birthday) {
        return _ageComputer.compute(birthday);
    }
}
