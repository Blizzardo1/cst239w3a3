package com.toasternetwork.week3.assignment3.part1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person adonis = new Person("Adonis", "Deliannis", 29);

        adonis.walk();
        adonis.run();
        System.out.printf("%s is %s\n", adonis.getFirstName(), adonis.isRunning() ? "running" : "walking");
        adonis.walk();
        System.out.printf("%s is %s\n", adonis.getFirstName(), adonis.isRunning() ? "running" : "walking");

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alexander", "Hamilton", 266));
        people.add(new Person("George", "Hamilton", 290));
        people.add(new Person("Angelo", "Tsarouchas", 45));
        people.add(new Person("Angelo", "Papakonstantinos", 62));
        Collections.sort(people);
        people.forEach(System.out::println);
    }
}
