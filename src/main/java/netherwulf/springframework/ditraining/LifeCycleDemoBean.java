package netherwulf.springframework.ditraining;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean(){
        System.out.println("I'm in the LifeCycleDemoBean constructor!!!");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("My Bean name is: " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("The Bean Factory has been set!!!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context has been set!!!");
    }

    void beforeInit(){
        System.out.println("Before init called by Bean Post Processor");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct annotated method has been called!!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The LifeCycleDemoBean has its properties set!!!");
    }

    void afterInit(){
        System.out.println("After init called by Bean Post Processor");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre Destroy annotated method has been called!!!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The LifeCycleDemoBean has been terminated!!!");
    }
}
