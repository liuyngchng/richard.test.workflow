package richard.test.workflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import richard.test.workflow.service.ActivityConsumerService;

@RestController
@RequestMapping("/activiti")
public class ActivitiController {

    @Autowired
    private ActivityConsumerService activityConsumerService;

    /**
     * 注册流程
     * @return
     */
    @RequestMapping("/createDeployment")
    public Boolean createDeployment(){
        return this.activityConsumerService.createDeployment();
    }

    /**
     * 启动流程
     * @return
     */
    @RequestMapping("/startActivityDemo")
    public Boolean startActivityDemo(String key){
        return this.activityConsumerService.startActivityDemo(key);
    }

    /**
     * 获取待办
     * @return
     */
    @RequestMapping("/getTaskList")
    public boolean getTaskList(){
        return this.activityConsumerService.getTaskList();
    }

    /**
     * 提交
     * @param taskId
     * @return
     */
    @RequestMapping("/complete")
    public boolean complete(String taskId){
        return this.activityConsumerService.complete(taskId);
    }
    /**
     * 根据流程id直接结束流程
     * @paramru
     * @return
     */
    @RequestMapping("/deleteProcessInstance")
    public boolean deleteProcessInstance(String runId){
        return this.activityConsumerService.deleteProcessInstance(runId);
    }

}