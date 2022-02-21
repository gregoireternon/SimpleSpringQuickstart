package exatoster.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greet")
public class HomeController {
    private Logger logger = LogManager.getLogger(HomeController.class);

    @GetMapping("/{name}")
    public String greet(@PathVariable String name, ModelMap model) {
        String greet = "Hello!!! " + name + " How are You?";
        logger.info(greet);
        return greet;
    }
}
