package com.rest.azure.springbootazurepoc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzurePoc1Application {
    @GetMapping("/message")
    public String getMessage(){
        return "Successfully Deployed Springboot app in Azure!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAzurePoc1Application.class, args);
    }

}
