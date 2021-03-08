package richard.test.workflow.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.engine.*;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.repository.Model;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Service("activityService")
public class ActivityConsumerServiceImpl implements ActivityConsumerService {

    @Autowired
    ActivityConsumerServiceImpl(RuntimeService runs, TaskService t, RepositoryService repo) {
        this.runtimeService = runs;
        this.taskService = t;
        this.repositoryService = repo;
    }

    private RuntimeService runtimeService;

    private TaskService taskService;

    private RepositoryService repositoryService;

    public String createModel() {

//        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
//
//        RepositoryService repositoryService = processEngine.getRepositoryService();

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode editorNode = objectMapper.createObjectNode();
        editorNode.put("id", "canvas");
        editorNode.put("resourceId", "canvas");
        ObjectNode stencilSetNode = objectMapper.createObjectNode();
        stencilSetNode.put("namespace", "http://b3mn.org/stencilset/bpmn2.0#");
        editorNode.replace("stencilset", stencilSetNode);
        Model modelData = this.repositoryService.newModel();

        ObjectNode modelObjectNode = objectMapper.createObjectNode();
        modelObjectNode.put(ModelDataJsonConstants.MODEL_NAME, "hello1111");
        modelObjectNode.put(ModelDataJsonConstants.MODEL_REVISION, 1);
        String description = "hello1111";
        modelObjectNode.put(ModelDataJsonConstants.MODEL_DESCRIPTION, description);
        modelData.setMetaInfo(modelObjectNode.toString());
        modelData.setName("hello1111");
        modelData.setKey("12313123");

        //保存模型
        this.repositoryService.saveModel(modelData);
        try {
            this.repositoryService.addModelEditorSource(modelData.getId(), editorNode.toString().getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return modelData.getId();
    }

    /**
     * 注册一个流程
     * @return
     */
    @Override
    public boolean createDeployment() {
        DeploymentBuilder builder = this.repositoryService.createDeployment();
        builder.addClasspathResource("test.bpmn");
        builder.deploy();
        return true;
    }

    /**
     * 查询待办
     * @return
     */
    public boolean getTaskList(){
        //获取待办的一些信息，这里可以传入需要查询的用户，
        //我这里查询的所有待办
        List<Task> tasks = this.taskService.createTaskQuery().list();
        for (Task t:tasks) {
            System.out.println(t.getCreateTime());
            System.out.println(t.getId());
            System.out.println(t.getName());
            System.out.println(t.getProcessInstanceId());
            System.out.println(t.getTaskDefinitionKey());
            System.out.println(t.getParentTaskId());
        }
        return true;
    }

    /**
     * 根据流程key开启一个流程
     * @param key
     * @return
     */
    @Override
    public boolean startActivityDemo(String key) {
        ProcessInstance test = this.runtimeService.startProcessInstanceByKey(key);
        String id = test.getId();
        System.out.println("流程id="+id);
        /*  */
        /*    String assignee = "abc";*/
        return true;
    }

    /**
     * 根据任务id提交任务
     * @param taskId
     * @return
     */
    @Override
    public boolean  complete(String taskId){
        taskService.complete(taskId);
        return true;
    }

    /**
     * 根据流程id直接结束流程
     * @param runId
     * @return
     */
    @Override
    public boolean  deleteProcessInstance(String runId){
        runtimeService.deleteProcessInstance(runId,"结束");
        return true;
    }
}
