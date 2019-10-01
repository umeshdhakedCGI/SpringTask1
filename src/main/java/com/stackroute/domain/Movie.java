package com.stackroute.domain;

/*
task 3
 */
import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
 private Actor actor;

    public Movie(Actor actor){
        this.actor = actor;
    }


public void setActor(Actor actor){
    this.actor = actor;
}


public void getMovieInfo(){

    actor.getName();
    actor.getAge();
    actor.getGender();

}


}
