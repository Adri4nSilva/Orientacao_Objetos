package com.adrian.pratica_01;

import java.util.Scanner;   

public class Ex05 
{
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);
        
        String nome = entrada.next();
        String sobrenome = entrada.nextLine();
        
        System.out.print(nome);
        System.out.print(sobrenome);
        entrada.close();
    }
}

 /*
    * Faça um programa em Java que receba da entrada padrão duas strings, nome e
    * sobrenome, e imprima na saída padrão a concatenação de nome e sobrenome,
    * separados por um espaço em branco " ".
    * 
    * Observações:
    * - Entrada padrão: usar classe Scanner.
    * - Saída padrão: System.out.
*/