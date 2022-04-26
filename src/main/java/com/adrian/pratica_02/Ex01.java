package com.adrian.pratica_02;

import java.util.Scanner;

public class Ex01 
{
    public static void main(String[] args){
        
        Scanner nota = new Scanner(System.in);
        
        
        double nota1, nota2, nota3, nota4;
        
        nota1 = nota.nextDouble();
        nota2 = nota.nextDouble();
        nota3 = nota.nextDouble();
        nota4 = nota.nextDouble();

        double notaf = (nota1+nota2+nota3+nota4)/4;
        System.out.printf("%.1f", notaf);
        nota.close();
    }
}

/*
    * Crie um programa em Java que recebe quatro valores de ponto flutuante
    * (doubles) da entrada padrão, calcula a média aritmética, e imprime na saída
    * padrão o valor da média, com uma casa decimal.
    * 
    * Observações:
    * - Entrada padrão: usar classe Scanner.
    * - Saída padrão: System.out.
 */