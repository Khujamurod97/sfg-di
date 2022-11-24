package uz.khujamurod.sfgdi.services;

//@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - Property";
    }
}
