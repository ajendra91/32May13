package com.example.CloudTask;

import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.listener.annotation.AfterTask;
import org.springframework.cloud.task.listener.annotation.BeforeTask;
import org.springframework.cloud.task.listener.annotation.FailedTask;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.stereotype.Component;

@Component
public class Demo{ // implements TaskExecutionListener {

    //@Override
    @BeforeTask
    public void onTaskStartup(TaskExecution taskExecution) {
        System.out.println("task start");
        //int i=10;
        //System.out.println(i/0);
    }

    //@Override
    @AfterTask
    public void onTaskEnd(TaskExecution taskExecution) {
        System.out.println("task end");
    }

    //@Override
    @FailedTask
    public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {
        System.out.println("task error");
    }
}
