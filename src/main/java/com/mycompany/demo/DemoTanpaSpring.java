/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

import java.util.Date;


/**
 *
 * @author okt19
 */
public class DemoTanpaSpring {
    
    public static void main(String[] args) {

        Person asep = new Person();
        asep.setNama("Asep Cahyana");
        asep.setTanggalLahir(new Date());
        
        Address bandung = new Address();
        bandung.setJalan("Jl. Raya Pangalengan");
        bandung.setKota("Bandung");
        bandung.setKodepos("12345");
        
        asep.setAlamat(bandung);
        
        System.out.println("Nama : " + asep.getNama());
        System.out.println("Alamat : " + asep.getAlamat().getJalan());
    }
}
