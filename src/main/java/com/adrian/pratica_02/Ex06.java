package com.adrian.pratica_02;

import java.util.Scanner;

public class Ex06 
{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int n=0, cont = 0, soma = 0, nums;
        while(n>=0)
        {
            nums = num.nextInt();
            n = nums;
            if(n>=0 || n<=0)
            {
                cont++;
                if(n>=0)
                {
                    soma += n;
                }
            }
        }
        System.out.println("Quantidade = " + cont);
        System.out.println("Soma = " + soma);
        num.close();
    }
}

 /*
    * Faça um programa em Java que lê números inteiros da entrada padrão até ler um
    * número inteiro negativo. O programa deve imprimir a quantidade e a soma dosa
    * números lidos, mas não deve incluir na soma o número inteiro negativo.
    * Observe a formatação usada nos exemplos de teste abaixo.
*/