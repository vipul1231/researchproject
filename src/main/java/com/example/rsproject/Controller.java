package com.example.rsproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @GetMapping({"/health"})
    public ResponseEntity<String> healthCheck() {
        log.info("Doing health check");
        return new ResponseEntity<>("All OK!!", HttpStatus.OK);
    }
}
