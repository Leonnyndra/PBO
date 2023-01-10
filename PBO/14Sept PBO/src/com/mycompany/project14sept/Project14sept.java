/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project14sept;


import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.lang.Math;

public class Project14sept {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 32, j;
        j =  n / 2;
        for (int i = 0; i < j ; i++) {
//            System.out.println(i + " " + n);
            if (n % 2 == 0) {
                n /= 2;
                if(n >= 2) {
//                System.out.println("if 1");
                    if(n % 2 == 1) {
//                        System.out.println("if 2");
                        System.out.println("Bukan");
                        break;
                    }
                } else {
                    System.out.println("Ya");
                    break;
                }
            } else {
                System.out.println("Bukan");
                break;
            }
        }
    }
}