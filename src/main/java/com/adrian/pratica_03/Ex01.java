package com.adrian.pratica_03;

import java.util.Scanner;

public class Ex01
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int vetor[];
        vetor = new int[n];
        float media, soma = 0;
        
        for(int i=0; i<n; i++)
        {
            vetor[i] = input.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            soma = soma + vetor[i];
        }
        media = (soma/n);
        System.out.printf("%.2f\n", (float)media);

        for(int i=0; i<n; i++)
        {
            if(vetor[i]>media)
            {
                System.out.println(vetor[i]);
            }
        }

        input.close();
    }
}


/*Faça um programa em Java que leia um número inteiro N > 1 da entrada padrão, e a seguir leia N valores inteiros e armazene em um vetor. 

Na sequência calcule a média aritmética desses valores e imprima na saída padrão a média calculada (com duas casas decimais) e, nas linhas seguintes, somente os valores maiores que a média calculada.

Imprima os valores maiores que a média calculada na ordem em que foram inseridos no vetor.

Dica:
- No Java é possível formatar a saída impressa com a instrução printf.
- Exemplo: System.out.printf("%.2f\n", media);
*/