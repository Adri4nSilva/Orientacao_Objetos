package com.adrian.pratica_03;

import java.util.Scanner;

public class Ex04 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nome = in.nextLine();
        String saida = "";

        for(int i=nome.length()-1; i>=0; i--)
        {
           saida = saida + nome.charAt(i);
        }  
        System.out.println(saida);
        System.out.println(saida.length());

        in.close();
    }
}

// Faça um programa em Java que receba uma frase (string) da entrada padrão e imprima essa frase invertida. Na próxima linha imprima o comprimento dessa frase (número de caracteres).

