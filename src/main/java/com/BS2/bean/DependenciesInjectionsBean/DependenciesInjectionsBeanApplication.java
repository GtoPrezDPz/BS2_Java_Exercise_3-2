package com.BS2.bean.DependenciesInjectionsBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DependenciesInjectionsBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependenciesInjectionsBeanApplication.class, args);
	}

	@Bean
	List<Population> getPopulationService(){

		Population population = new Population();

		List <Population> populationList = new ArrayList<Population>();
		populationList.add(population);
		return populationList;

	}

}

