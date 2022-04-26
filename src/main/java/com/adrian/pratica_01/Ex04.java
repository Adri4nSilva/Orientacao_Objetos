package com.adrian.pratica_01;

import java.util.Scanner;

public class Ex04 
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int valor = entrada.nextInt();
        int valor2 = entrada.nextInt();
        
        System.out.print("soma = ");
        System.out.println(valor + valor2);
        System.out.print("subtracao = ");
        System.out.println(valor - valor2);

        entrada.close();
    }
}

/*
    * Faça um programa em Java que lê dois números inteiros n e m, e depois imprima
    * na saída padrão o resultado da soma e da subtração de n e m. Segue abaixo o
    * formato da saída esperada, considerando n=10 e m=5:
    * 
    * soma = 15
    * subtracao = 5
    * 
    * Dicas:
    * - Sugestão de nome da classe: Numeros.
    * - Usar Scanner para ler da entrada padrão.
    * - Usar System.out.println() para imprimir na saída padrão.
    * - O operador de concatenação do Java é +
    * - exemplo: "soma = " + var_valor
*/