package com.ohashi.spring_async_example_service.application.web.controllers;

import com.ohashi.spring_async_example_service.domain.services.AsyncService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/async")
public class AsyncController {
    private final AsyncService asyncService;

    public AsyncController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @PostMapping
    public ResponseEntity<Void> counter() {
        asyncService.counter();
        return ResponseEntity.ok().build();
    }
}
