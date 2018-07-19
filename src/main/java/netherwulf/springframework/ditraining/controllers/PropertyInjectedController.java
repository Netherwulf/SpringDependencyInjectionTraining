package netherwulf.springframework.ditraining.controllers;

import netherwulf.springframework.ditraining.services.GreetingServiceImpl;

public class PropertyInjectedController {
    private GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
