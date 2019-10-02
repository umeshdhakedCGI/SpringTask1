package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Task-4
 */
public class Main
{
    public static void main( String[] args )
    {

     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ((AbstractApplicationContext)context).registerShutdownHook();

     //   ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

 //    BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));

//        Movie move1 = (Movie)context.getBean("movie1",Movie.class);
//        move1.getMovieInfo();

        BeanLifecycleDemoBean beanlifecycle = (BeanLifecycleDemoBean) context.getBean("beanlifecycle",BeanLifecycleDemoBean.class);
        beanlifecycle.getinfo();

    }
}
