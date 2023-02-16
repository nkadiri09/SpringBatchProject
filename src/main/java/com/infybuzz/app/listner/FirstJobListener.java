package com.infybuzz.app.listner;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Service;

@Service
public class FirstJobListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Before Job: "+jobExecution.getJobInstance().getJobName());
        System.out.println("Job Parameters: "+jobExecution.getJobParameters());
        System.out.println("job Execution context : "+jobExecution.getExecutionContext());
        jobExecution.getExecutionContext().put("TestKey", "TestValue");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {

        System.out.println("After Job: "+jobExecution.getJobInstance().getJobName());
        System.out.println("Job Parameters: "+jobExecution.getJobParameters());
        System.out.println("job Execution context : "+jobExecution.getExecutionContext());

    }
}
