package netherwulf.springframework.ditraining.controllers;

import netherwulf.springframework.ditraining.springframework.services.GreetingServiceImpl;
import netherwulf.springframework.ditraining.springframework.controllers.PropertyInjectedController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        Assert.assertEquals(GreetingServiceImpl.HELLO_KAMIL, propertyInjectedController.sayHello());
    }
}
