package com.example.frontenddel;

import com.example.frontenddel.Model.Person;
import org.springframework.web.client.RestTemplate;

public class ApiConsumer {

    public Person CheckName(String name) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        Person person = restTemplate.getForObject("https://api.genderize.io?name=" + name, Person.class);
    //       log.info(person.toString());
        System.out.println();
        System.out.println(person);
        System.out.println();
        return person;
    }
}
