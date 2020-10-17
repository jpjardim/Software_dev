package com.l00161844.assign1;

/**
 * @author Paulo Jardim
 *
 */

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

    /**
     * Getter
     * @return the person age
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return the person description
     */
    abstract String getDescription();

    /**
     *
     * @return the person name
     */
    public String getName(){
        return name;
    }
}
