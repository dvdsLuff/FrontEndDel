package com.example.frontenddel.Controller;

import com.example.frontenddel.ApiConsumer;
import com.example.frontenddel.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SiteController {

    ApiConsumer apiConsumer = new ApiConsumer();

    @GetMapping("/index")
    public String index (){

        return "index.html";
    }

    @PostMapping("/nameresult")
    public String nameResult(WebRequest request, Model model) throws Exception {
        String name = request.getParameter("nameCheck");
        Person person = apiConsumer.CheckName(name);

        System.out.println("fra cont " + person.getName()+ ", gender=" +person.getGender()+ ", prob=" + person.getProbability());
        List<Person> list = new ArrayList<>();
        list.add(person);

        model.addAttribute("persons",list);

        return "nameresult.html";
    }

}
