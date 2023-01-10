/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.okt22;

/**
 *
 * @author ACER
 */
public class tampilMakan {
    public static void main(String[] args) {
    
        //OBJEK
        //NKelas Nobjek = newNKelas();
        Makanan m=new Makanan();
        
        
            //manual
//        System.out.println(m.tampilMakanan()[0]);
//        System.out.println(m.tampilMakanan()[1]);
//        System.out.println(m.tampilMakanan()[2]);
//        System.out.println(m.tampilMakanan()[3]);
//        System.out.println(m.tampilMakanan()[4]);
        
        //for cara 1
//        for(int x=0; x<5; x++){
//            System.out.println(m.tampilMakanan()[x]);
//        }

        //for cara 2
//        String[] temp;
////        temp=m.tampilMakanan();
//            temp=m.tampilGenap();
//          for(int i=0; i<temp.length; i++){
//            System.out.println(temp[i]);
//        }

String[] temp;

            temp=m.tampilGenap();
          for(int i=0; i<temp.length; i++){
            System.out.println(temp[i]);
          }  
    }      

    
}
