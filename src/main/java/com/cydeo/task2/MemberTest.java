package com.cydeo.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("Efe", 20,Gender.MALE,"ecs@ecs.com");
        Person p2 = new Person("Ensar", 32,Gender.MALE,"ens@ecs.com");
        Person p3 = new Person("Umran", 24,Gender.FEMALE,"umr@ecs.com");
        Person p4 = new Person("Sezai", 19,Gender.MALE,"szi@ecs.com");
        Person p5 = new Person("Ahsen", 36,Gender.FEMALE,"ahsn@ecs.com");

        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);

        CheckMember checkMember = p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25;

        print(personList,checkMember);

        print(personList,p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25);

    }

    private static void print (List<Person> personList, CheckMember checkMember){
        List<Person> result = new ArrayList<>();
        for (Person person : personList){
            if (checkMember.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }



}
