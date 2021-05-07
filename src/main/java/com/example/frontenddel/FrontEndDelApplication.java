package com.example.frontenddel;


import com.mashape.unirest.http.exceptions.UnirestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpRequest;

@SpringBootApplication
public class FrontEndDelApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(FrontEndDelApplication.class);

    public FrontEndDelApplication() throws UnirestException {
    }

    public static void main(String[] args) {
        SpringApplication.run(FrontEndDelApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        Person person = restTemplate.getForObject("https://api.genderize.io?name=mary", Person.class);
        log.info(person.toString());
        System.out.println();
        System.out.println(person);
        System.out.println();
    }



}
