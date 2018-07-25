package netherwulf.springframework.ditraining.controllers;

import netherwulf.springframework.ditraining.springframework.services.GreetingServiceImpl;
import netherwulf.springframework.ditraining.springframework.controllers.SetterInjectedController;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp(){
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_KAMIL, setterInjectedController.sayHello());
    }
}
