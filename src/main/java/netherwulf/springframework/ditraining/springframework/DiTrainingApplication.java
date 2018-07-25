package netherwulf.springframework.ditraining.springframework;

import netherwulf.springframework.ditraining.springframework.controllers.ConstructorInjectedController;
import netherwulf.springframework.ditraining.springframework.controllers.MyController;
import netherwulf.springframework.ditraining.springframework.controllers.PropertyInjectedController;
import netherwulf.springframework.ditraining.springframework.controllers.SetterInjectedController;
import netherwulf.springframework.ditraining.springframework.examplebeans.FakeDataSource;
import netherwulf.springframework.ditraining.springframework.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"netherwulf.springframework.ditraining.springframework.services", "netherwulf.springframework.ditraining.springframework"})
public class DiTrainingApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiTrainingApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");


        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUsername());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getUsername());

//        System.out.println(controller.hello());
//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
