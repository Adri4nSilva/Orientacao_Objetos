package com.adrian.pratica_03;

import java.util.Scanner;

public class Ex05
{   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int contador = 0;

        String frase = in.nextLine();
        String palavra = in.next();

        for(int i=0; i<frase.length(); i++)
        {
            if(frase.substring(i).startsWith(palavra))
            {
                contador++;
            }
        }
        System.out.println(palavra + "=" + contador);

        in.close();
    }    
}

/*
    *Faça um programa em Java que leia dois parâmetros da entrada padrão, sendo o primeiro um texto qualquer e o segundo uma palavra de pesquisa. O programa deve contar quantas vezes a palavra de pesquisa aparece no texto e imprimir na saída padrão. A saída deve obedecer a seguinte formatação:

    *Considerando texto = "Meu primeiro programa em Java imprime Java." e pesquisa = "Java", o programa deve imprimir:

    *- Java=2

*/