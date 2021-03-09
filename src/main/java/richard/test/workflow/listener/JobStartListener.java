package richard.test.workflow.listener;

import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;

public class JobStartListener implements ActivitiEventListener {

    @Override
    public void onEvent(ActivitiEvent activitiEvent) {
        System.out.println("some event happened.");
    }

    @Override
    public boolean isFailOnException() {
        System.out.println("some event failed.");
        return false;
    }
}
