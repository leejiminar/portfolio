package com.portfolio.portfolio.Home.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApiController {

    @GetMapping("/")
    public ResponseEntity<?> Home() {

        return ResponseEntity.ok().body("ok");
    }
}
