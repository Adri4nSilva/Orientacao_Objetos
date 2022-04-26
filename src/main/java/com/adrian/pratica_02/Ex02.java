package com.adrian.pratica_02;

import java.util.Scanner;

public class Ex02 
{
    public static void main(String[] args){
        Scanner nota = new Scanner(System.in);
        double num = nota.nextDouble();
        int valor = (int) num;
        System.out.println(valor);
        nota.close();
    }
}

/*
    * Faça um programa em Java que recebe da entrada padrão um valor ponto
    * flutuante e imprime na saída padrão o mesmo valor, porém convertido para
    * inteiro (operação de casting).
*/