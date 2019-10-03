package com.stackroute.domain;

/*
task 2
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Movie {

 private Actor actor;

 public Movie(Actor actor){
     this.actor=actor;
 }


public void setActor(Actor actor){
    this.actor = actor;
}


public void getMovieInfo(){
    System.out.println(actor.getName()+" "+actor.getAge()+" "+actor.getGender());

}


}
