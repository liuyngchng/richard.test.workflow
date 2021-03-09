package richard.test.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动后自动创建表，库需要事先创建好，执行的sql语句详见
 * ～/.m2/repository/org/activiti/activiti-engine/6.0.0/activiti-engine-6.0.0.jar!/org/activiti/db/create/*.sql
 * RepositoryService：提供一系列管理流程部署和流程定义的API。
 * RuntimeService：在流程运行时对流程实例进行管理与控制。
 * TaskService：对流程任务进行管理，例如任务提醒、任务完成和创建任务等。
 * IdentityService：提供对流程角色数据进行管理的API，这些角色数据包括用户组、用户及它们之间的关系。
 * ManagementService：提供对流程引擎进行管理和维护的服务。
 * HistoryService：对流程的历史数据进行操作，包括查询、删除这些历史数据。
 * FormService：表单服务
 */
@SpringBootApplication(exclude = {
        org.activiti.spring.boot.SecurityAutoConfiguration.class
} )
public class ActivitiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivitiApplication.class, args);
    }

}