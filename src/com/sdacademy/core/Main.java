package com.sdacademy.core;
// cititeste si afiseaza cel mai mare numar intreg
import com.sun.deploy.util.SystemUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Acesta este primul numar ales : ");
        int a = input.nextInt();

        System.out.printf("Acesta este al doilea numar ales : ") ;
        int b = input.nextInt();

        if(a<b){
            System.out.println("\n" + b + " este mai mare decat " + a);}

            else if(b<a) {
                System.out.println("\n"+a + " este mai mare decat " + b);
            }
                    else{
                            System.out.println("\n"+ a + " este egal cu " + b);
            }
        }
    }

