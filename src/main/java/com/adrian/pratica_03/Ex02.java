package com.adrian.pratica_03;

import java.util.Scanner;

public class Ex02 
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int linha1[], linha2[];
        linha1 = new int[n];
        linha2 = new int[n];

        for(int i=0; i<n; i++)
        {
            linha1[i] = in.nextInt();
        }
        for(int j=0; j<n; j++)
        {
            linha2[j] = in.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(linha1[i] == linha2[j])
                {
                    System.out.println(linha1[i]);
                }
            }
        }

        in.close();
    }
}

/* 
    *Faça um programa em Java que leia dois conjuntos de número de tamanho N>1 e imprima no console a interseção dos dois conjuntos, ou seja, quais números estão em ambos os conjuntos.

    * Entrada:
    *- Um número inteiro N representando o número de elementos de ambos os conjuntos.
    *- N inteiros para o conjunto 1.
    *- N inteiros para o conjunto 2.

    * Saída:
    *- Lista de números que estão em ambos os conjuntos (interseção).
*/

