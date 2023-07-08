package com.cydeo.task1;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(new Orange(200,Color.RED));
        inventory.add(new Orange(150,Color.ORANGE));
        inventory.add(new Orange(80,Color.ORANGE));


        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintOrange(inventory,orangeLambda);

        prettyPrintOrange(inventory, orange -> "An orange of " + orange.getWeight() + "g"); // same as line 17, 18

        System.out.println("--------------------");

        OrangeFormatter fancyFormatter = orange -> {
            String weight = orange.getWeight()>200? "heavy" : "light";
            return "A " + weight +" "+ orange.getColor() + " orange";
        };

        prettyPrintOrange(inventory,fancyFormatter);
    }

    private static void prettyPrintOrange (List<Orange> inventory, OrangeFormatter formatter){
        for (Orange each : inventory){
            String output = formatter.accept(each) ;
            System.out.println(output);
        }
    }



}
