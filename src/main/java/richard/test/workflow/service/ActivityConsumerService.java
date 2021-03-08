package richard.test.workflow.service;

public interface ActivityConsumerService {

    boolean createDeployment();

    boolean startActivityDemo(String key);

    boolean getTaskList();

    boolean  complete(String taskId);

    boolean  deleteProcessInstance(String runId);
}
