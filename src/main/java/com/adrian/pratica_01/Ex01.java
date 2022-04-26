package com.adrian.pratica_01;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);   

        int num = entrada.nextInt();
        double valor = entrada.nextDouble();
        String caracter = entrada.next();

        System.out.println(num);
        System.out.println(valor);
        System.out.println(caracter);
        
        entrada.close();
    }
}

/*
    * Faça um programa em Java que receba um número inteiro, um número de ponto
    * flutuante e uma palavra (String). Na sequência, imprima os valores lidos na
    * saída padrão, um valor por linha.
*/