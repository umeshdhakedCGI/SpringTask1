package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Task-2
 */
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Movie move1 = context.getBean("movie1",Movie.class);
        move1.getMovieInfo();
        Movie move2 = context.getBean("movie2",Movie.class);
        move2.getMovieInfo();

        System.out.println(move1==move2);

        Movie move3 = context.getBean("movie3",Movie.class);
        move2.getMovieInfo();

    }
}
