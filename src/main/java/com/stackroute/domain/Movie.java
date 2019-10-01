package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Movie {

 private Actor actor;



public void setActor(Actor actor){
    this.actor = actor;
}


public void getMovieInfo(){

    actor.getName();
    actor.getAge();
    actor.getGender();

}


}
