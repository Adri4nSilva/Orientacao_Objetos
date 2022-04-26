package com.adrian.pratica_02;

import java.util.Scanner;

public class Ex03 
{
    public static void main(String[] args){
        Scanner maior = new Scanner(System.in);
        int n1, n2, n3;
        n1 = maior.nextInt();
        n2 = maior.nextInt();
        n3 = maior.nextInt();
        
        if((n1>n2 && n1>n3)||n1==n2 || n1==n3)
        {
            System.out.print(n1);
        }
        else if((n2>n3 && n2>n1)|| n2 == n3 || n2 == n1)
        {
            System.out.print(n2);
        }
        else if((n3>n1 && n3>n2)||n3 == n1 || n3 == n2)
        {
            System.out.print(n3);
        }
        else
        {
            System.out.print(n1);
        }
        maior.close();
    }
}

/*
    * Faça um programa em Java que recebe três inteiros da entrada padrão e imprime
    * o MAIOR valor.
    * 
    * Observações:
    * - Entrada padrão: usar classe Scanner.
    * - Saída padrão: System.out.
*/
