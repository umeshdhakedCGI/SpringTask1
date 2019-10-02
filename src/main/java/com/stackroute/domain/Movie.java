package com.stackroute.domain;

/*
task 3
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {

    @Autowired
    private Actor actor1;
    private Actor actor2;
    public Movie(){}


    public Movie(Actor actor1, Actor actor2){     // now id=actor1 and actor2 will be injected inside this because of variable name
        this.actor1= actor1;
        this.actor2=actor2;
    }

    public void setActor1(Actor actor1) {  //now actor1 will be injected because of method name.
        this.actor1 = actor1;
    }

public void getMovieInfo(){

    actor1.getName();
    actor1.getAge();
    actor1.getGender();
    try {
        System.out.println("just checking .......P");
        actor2.getName();
    }
    catch (Exception e){

    }
}


}
