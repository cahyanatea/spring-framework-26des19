/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.aop;

/**
 *
 * @author okt19
 */
public class TargetObject {

    public String halo(String nama) {
        System.out.println("Menjalankan method halo");

        return "Halo " + nama;
    }
}
