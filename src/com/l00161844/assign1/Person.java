package com.l00161844.assign1;

public abstract class Person {
    private String name;
    private int age;

    public Person(){
        name = "Don't know";
        age = 0;
    }

    public Person(String n, int a){
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    abstract String getDescription();

    public String getName(){
        return name;
    }
}
