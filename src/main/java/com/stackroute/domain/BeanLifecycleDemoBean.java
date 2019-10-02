package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void getinfo(){
        System.out.println("Info : ..");
    }

    public void customInit(){
        System.out.println("customInit");
    }

    public void customDestroy(){
        System.out.println("customDestroy");
    }






}
