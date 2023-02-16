package com.infybuzz.app.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Service;

@Service
public class FirstStepListener implements StepExecutionListener {
    @Override
    public void beforeStep(StepExecution stepExecution) {
        System.out.println("before step: "+stepExecution.getStepName());
        System.out.println("before step ExecutionContext : "+stepExecution.getExecutionContext());
        System.out.println("before step params: "+stepExecution.getJobExecution().getExecutionContext());
        stepExecution.getJobExecution().getExecutionContext().put("JobECKey", "JobEC Value");
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        System.out.println("After step: "+stepExecution.getStepName());
        System.out.println("After step ExecutionContext : "+stepExecution.getExecutionContext());
        System.out.println("After step params: "+stepExecution.getJobExecution().getExecutionContext());
        return null;
    }
}
