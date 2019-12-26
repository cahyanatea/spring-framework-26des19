/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *
 * @author okt19
 */
public class InfoArgumen implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("===== Info Argumen =====");
        
        System.out.println("Nama method : " + mi.getMethod().getName());
        System.out.println("Jumlah argumen : " + mi.getArguments().length);
        
        int i = 1;
        for (Object arg : mi.getArguments()) {
            System.out.println("Argumen " + i + " : " + arg);
            i++;
        }
        
        Object hasil = mi.proceed();
        System.out.println("===== Info Argumen =====");
        
        return hasil;
    }
}
