package com.infybuzz.app.listner;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Service;

@Service
public class FirstStepListener implements StepExecutionListener {

    @Override
    public void beforeStep(StepExecution stepExecution) {
        System.out.println("Before Step: "+stepExecution.getStepName());
        System.out.println("Before StepExecution Context: "+stepExecution.getExecutionContext());
        stepExecution.getExecutionContext().put("StepKey", "StepValue");
        System.out.println("Before JobExecution Context: "+stepExecution.getJobExecution().getExecutionContext());

    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        System.out.println("After Step: "+stepExecution.getStepName());
        System.out.println("After StepExecution Context: "+stepExecution.getExecutionContext());
        System.out.println("After JobExecution Context: "+stepExecution.getJobExecution().getExecutionContext());
        return null;
    }
}
