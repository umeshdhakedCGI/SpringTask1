package com.stackroute.domain;

/*
task 4
 */
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    private ApplicationContext context = null;
    private BeanFactory factory=null;

    //Constructors


    public Movie(){}  // default constructor is needed for programme to run (to create bean with no constructor dependency-injection)


    public Movie(Actor actor1, Actor actor2, Actor actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    public Movie(Actor actor1) {                // using by beans
        this.actor1 = actor1;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }




    public void setActor3(Actor actor){     // Setter Should be like "  setVariableName
    this.actor3 = actor;
}

public void getMovieInfo(){
    System.out.print("\none : ");
    actor1.getName();
    actor1.getAge();
    actor1.getGender();
    System.out.print("\ntwo : ");
    actor2.getName();
    actor2.getAge();
    actor2.getGender();
    System.out.print("\nthree : ");
    actor3.getName();
    actor3.getAge();
    actor3.getGender();

}


    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context=context;
      //  System.out.println("setApplicationContext");    //Only called when ApplicationContext is used in main instead of BeanFactory
    }

    @Override
    public void setBeanName(String s) {
      //  System.out.println("Bean name is : "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.factory = beanFactory;     // called when ApplicationContext or BeanFactory is used in main
       // System.out.println("setBeanFactory");
    }
}
