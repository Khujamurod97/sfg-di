package uz.khujamurod.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import test.services.PetService;
import uz.khujamurod.sfgdi.controllers.*;
import uz.khujamurod.sfgdi.examplebean.FakeDataSource;
import uz.khujamurod.sfgdi.examplebean.FakeJmsBroker;
import uz.khujamurod.sfgdi.examplebean.UIProperties;
import uz.khujamurod.sfgdi.services.beanscope.PrototypeBean;
import uz.khujamurod.sfgdi.services.beanscope.SingletonBean;

@SpringBootApplication
@ComponentScan(basePackages = {"uz.khujamurod.sfgdi", "test.services"})
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());
//
//        MyController myController = (MyController) ctx.getBean("myController");
//        System.out.println("---------------Primary Bean");
//        System.out.println(myController.sayHello());
//        System.out.println("---------------Property");
//        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//        System.out.println(propertyInjectedController.getGreeting());
//        System.out.println("---------------Setter");
//        SetterInjectedController setterBasedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
//        System.out.println(setterBasedController.sayGreeting());
//        System.out.println("---------------Constructor");
//        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//        System.out.println(constructorInjectedController.getGreeting());
        FakeDataSource dataSourceProperties = ctx.getBean(FakeDataSource.class);
        UIProperties uiProperties = ctx.getBean(UIProperties.class);
        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(dataSourceProperties.getUsername());
        System.out.println(uiProperties.getFormat());
        System.out.println(fakeJmsBroker.getUsername());

//        PetService petService = (PetService) ctx.getBean("petService");

        System.out.println("-----------BEAN SCOPE -------------");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());
        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());

    }

}
