package netherwulf.springframework.ditraining;

import netherwulf.springframework.ditraining.controllers.ConstructorInjectedController;
import netherwulf.springframework.ditraining.controllers.MyController;
import netherwulf.springframework.ditraining.controllers.PropertyInjectedController;
import netherwulf.springframework.ditraining.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiTrainingApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiTrainingApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
