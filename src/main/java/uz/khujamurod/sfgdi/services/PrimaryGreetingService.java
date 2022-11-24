package uz.khujamurod.sfgdi.services;

//@Service
//@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Primary";
    }
}
