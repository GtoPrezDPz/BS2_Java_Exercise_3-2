package com.BS2.bean.DependenciesInjectionsBean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    List<Population> populationList;

    @PostMapping("/controller/addPerson")
    public String addPopulation(@RequestBody Population population){
        populationList.add(population);
        return "population " + population.toString() + " added";
    }

    @GetMapping("/controller/getPopulation")
    public List getPopulationList(){
        return populationList;
    }

}
