package com.toasternetwork.week3.assignment3.part1;

public class Person implements IPerson, Comparable<Person> {
    private boolean running = false;
    private final String firstName;
    private final String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
        running = false;
    }

    @Override
    public void run() {
        System.out.println("I am running");
        running = true;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Person o) {
        int val = lastName.compareTo(o.lastName);
        if(val == 0)
            return firstName.compareTo(o.firstName);
        if(age == o.age)
            return 0;
        return val;
    }
}
