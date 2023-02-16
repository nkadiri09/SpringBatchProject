package com.infybuzz.app.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Service;

@Service
public class FirstJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("before Job: "+jobExecution.getJobInstance());
        System.out.println("before Job ExecutionContext : "+jobExecution.getExecutionContext());
        System.out.println("before Job params: "+jobExecution.getJobParameters());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("After Job: "+jobExecution.getJobInstance());
        System.out.println("After Job ExecutionContext : "+jobExecution.getExecutionContext());
        System.out.println("After Job params: "+jobExecution.getJobParameters());
    }
}
