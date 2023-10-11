package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }

    private Auth savedAuth;



    @PostMapping("/accounts")
    public ResponseEntity<?> handlePostRequest(@RequestBody Auth request) {
        savedAuth = request;
        return ResponseEntity.ok().build();
    }

    @GetMapping("/accounts")
    public ResponseEntity<?> handleGetRequest() {
        if (savedAuth.getData() instanceof Info) {
            return ResponseEntity.ok(savedAuth.getData());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(savedAuth.getData());

    }

    @GetMapping("/accounts/{accountNumber}")
    public ResponseEntity<?> handleGetRequestAccount(@PathVariable String accountNumber) {
        String responseString = "номер отправленного аккаунта = " + accountNumber;
        return ResponseEntity.ok(responseString);
    }


}
