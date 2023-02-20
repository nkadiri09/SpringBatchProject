package com.infybuzz.app.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class FirstItemProcessor implements ItemProcessor<Integer, Long> {
    @Override
    public Long process(Integer integer) throws Exception {
        System.out.println("inside Item Processor");
        return (long) (integer + 50);
    }
}
