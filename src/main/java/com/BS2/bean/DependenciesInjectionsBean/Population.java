package com.BS2.bean.DependenciesInjectionsBean;


import lombok.Data;

@Data
public class Population {
    String name;
    int population;

    @Override
    public String toString(){
        return  name + " with Population: " + population;
    }
}


