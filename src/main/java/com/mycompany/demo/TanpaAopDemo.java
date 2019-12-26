/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

import com.mycompany.demo.aop.TargetObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author okt19
 */
public class TanpaAopDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop.xml");
        
        TargetObject to = (TargetObject) context.getBean("targetObject");
        String hasil = to.halo("Asep");
        System.out.println(hasil);
    }
}
