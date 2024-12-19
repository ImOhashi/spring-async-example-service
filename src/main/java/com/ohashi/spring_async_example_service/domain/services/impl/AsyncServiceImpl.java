package com.ohashi.spring_async_example_service.domain.services.impl;

import com.ohashi.spring_async_example_service.domain.services.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class AsyncServiceImpl implements AsyncService {

    private static final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);

    @Async
    @Override
    public void counter() {
        int seconds = 60;

        for (int time = seconds; time >= 0; time--) {
            try {
                logger.info("Time: {} seconds", time);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
