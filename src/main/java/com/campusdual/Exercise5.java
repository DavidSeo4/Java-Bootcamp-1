package com.campusdual;

import com.campusdual.util.Input;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Input input = new Input();

        int numero1 = 30;
        int numero2 = 3;

        if (numero1>=0){
            System.out.println( numero1 + " is positive");
        } else {
            System.out.println( numero1 + " is negative");
        }

        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " no es múltiplo de " + numero2);
        }

        if (numero1<numero2){
            System.out.println(numero1 + " Menor que " + numero2);
        } else {
            System.out.println(numero1 + " Mayor que " + numero2);
        }


    }
}
