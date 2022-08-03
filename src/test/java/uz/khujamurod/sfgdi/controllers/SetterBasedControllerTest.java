package uz.khujamurod.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uz.khujamurod.sfgdi.services.ConstructorGreetingService;

class SetterBasedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}