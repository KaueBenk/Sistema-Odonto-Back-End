package com.kauemarcosmaicon.ondonto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class OndontoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OndontoApplication.class, args);
    }

}
