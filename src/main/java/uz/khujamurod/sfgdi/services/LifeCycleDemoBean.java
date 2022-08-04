package uz.khujamurod.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("##I'm in then LifeCycleDemoBean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My Bean name is " + s);
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## after property set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application Context has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The post constructor annotation method has been called");
    }
}
