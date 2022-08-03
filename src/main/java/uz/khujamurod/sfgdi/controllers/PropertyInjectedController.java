package uz.khujamurod.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import uz.khujamurod.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier(value = "propertyInjectedGreetingService")
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
