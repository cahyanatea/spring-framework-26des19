/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author okt19
 */
public class DemoTanpaSpring {
    
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc.xml");
        Person asep = (Person) context.getBean("asep");
        
        System.out.println("Nama : " + asep.getNama());
        System.out.println("Alamat : " + asep.getAlamat().getJalan());
    }
}
