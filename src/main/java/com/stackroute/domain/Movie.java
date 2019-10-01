package com.stackroute.domain;

/*
task 4
 */
import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    @Autowired
    private Actor actor3;

    public Movie(){
        System.out.println("cons");
    }

    public Movie(Actor actor3){
        this.actor3 = actor3;
        System.out.println("con args");
    }


public void setActor(Actor actor3){
    this.actor3 = actor3;
    System.out.println("lol");
}


public void getMovieInfo(){

    actor3.getName();
    actor3.getAge();
    actor3.getGender();

}


}
