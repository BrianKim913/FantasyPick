package org.example.fantasypick.application.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.example.fantasypick")
public class FantasyPickApplication {

    public static void main(String[] args) {
        SpringApplication.run(FantasyPickApplication.class, args);
    }

}
