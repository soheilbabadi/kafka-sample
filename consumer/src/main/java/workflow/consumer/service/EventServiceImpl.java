package workflow.consumer.service;


import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Override
    public void addNewEmployee() {

        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        runtimeService.signalEventReceived("added_new_employee");
//        System.out.println("کاربر جدید ثبت شد");

    }


}