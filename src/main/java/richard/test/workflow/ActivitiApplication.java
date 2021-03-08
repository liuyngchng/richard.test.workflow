package richard.test.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动后自动创建表，库需要事先创建好，执行的sql语句详见
 * ～/.m2/repository/org/activiti/activiti-engine/6.0.0/activiti-engine-6.0.0.jar!/org/activiti/db/create/*.sql
 */
@SpringBootApplication(exclude = {
        org.activiti.spring.boot.SecurityAutoConfiguration.class
} )
public class ActivitiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivitiApplication.class, args);
    }

}