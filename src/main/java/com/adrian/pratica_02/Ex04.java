package com.adrian.pratica_02;

import java.util.Scanner;

public class Ex04 
{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.print(i + " ");
        }
        num.close();
    }
}

/*
    * Faça um programa em Java que receba da entrada padrão um inteiro n>0 e
    * imprima na saída padrão os números de 1...n.
*/

