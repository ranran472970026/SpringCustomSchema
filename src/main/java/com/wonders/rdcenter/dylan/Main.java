package com.wonders.rdcenter.dylan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dylan_Apple on 16/7/19.
 */
public class Main {

    public static void  main(String[] args){

        System.out.println("----"+Main.class.getClass().getResource("/").getPath().toString());
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "beans.xml");

        UserSchema userSchema=(UserSchema) context.getBean("userInfo");

        System.out.println("custom schema username is "+userSchema.getUsername());
        System.out.println("custom schema password is "+userSchema.getPassword());

    }

}
