package com.adrian.pratica_02;

import java.util.Scanner;

public class Ex08 
{
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int n=0, a=0, b=0, c=0, d=0, valores;
        while(n>=0)
        {
            valores = valor.nextInt();
            n = valores;
            if(n>=0 && n<= 25)
            {
                a++;
            }
            else if(n>=26 && n<=50)
            {
                b++;
            }
            else if(n>=51 && n<= 75)
            {
                c++;
            }
            else if(n>=76 && n<=100)
            {
                d++;
            }
        }
        System.out.println("[0,25] = " + a);
        System.out.println("[26,50] = " + b);
        System.out.println("[51,75] = " + c);
        System.out.println("[76,100] = " + d);
        valor.close();
    }
}


/*
    * Faça um programa Java que leia uma quantidade desconhecida de números
    * positivos e conte quantos deles estão nos seguintes intervalos: [0,25],
    * [26,50], [51,75] e [76,100].
    * 
    * A entrada de dados deve terminar quando for lido um número negativo.
*/
