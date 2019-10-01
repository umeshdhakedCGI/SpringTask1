package com.stackroute.domain;

public class Actor {

    private String name;
    private String gender;
    private int age;



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void getGender() {
        System.out.println(gender);
    }

    public void getAge() {
        System.out.println(age);
    }

    public void getInfo(){
        System.out.println("Nam ");
    }
}
