package com.example.frontenddel;


import com.example.frontenddel.Model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FrontEndDelApplication {
    //not sure hvad logger er eller gør, det virker uden ? :S
//    private static final Logger log = LoggerFactory.getLogger(FrontEndDelApplication.class);

//    public FrontEndDelApplication() throws UnirestException {
//    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FrontEndDelApplication.class, args);


    }
////dette skal flyttes ud i egen klasse, eller whatever.
//    @Override
//    public void run(String... args) throws Exception {
//        RestTemplate restTemplate = new RestTemplate();
//
//        Person person = restTemplate.getForObject("https://api.genderize.io?name=emil", Person.class);
////        log.info(person.toString());
//        System.out.println();
//        System.out.println(person);
//        System.out.println();
//    }



}
