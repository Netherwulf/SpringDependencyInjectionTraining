package netherwulf.springframework.ditraining;

import netherwulf.springframework.ditraining.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiTrainingApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiTrainingApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
    }
}
