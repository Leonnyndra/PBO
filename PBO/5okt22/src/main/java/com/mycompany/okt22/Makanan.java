/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.okt22;

/**
 *
 * @author ACER
 */
public class Makanan {
    //Atribut
    //am + TD + NA;
    public String[] namaMakanan = 
    {"Nasi Goreng", "Nasi Rames", "Ayam Geprek", "Rendang", "Babi Kecap"};
    
    
    //Method
    //AM + TD + NM(P){...}
    public String[] tampilMakanan(){
    return namaMakanan;
    }

    
          
     public String[] tampilGenap(){
    
    //0. Temporary[]
          String[] menuGnp= new String[5];
          int a=0;
            
    //1. unboxing for
          for(int i=0; i<namaMakanan.length; i++){
              
    //2. if genap/ganjil
          if(i%2==0){
              
    //3. temporary[] = nilainya
          menuGnp[a]=namaMakanan[i]; a++;
          }
    }
    //4. return temporary
          return menuGnp;
          }
    
}
