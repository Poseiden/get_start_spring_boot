package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class,args);

        System.out.println("Let's inspect beans");

        String[] beans = applicationContext.getBeanDefinitionNames();

        for(String bean : beans){
            System.out.println(bean);
        }
    }
}
