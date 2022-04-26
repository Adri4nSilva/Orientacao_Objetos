package com.adrian.pratica_02;

import java.util.Scanner;

public class Ex07 
{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        
        int cod = num.nextInt();
        
        switch(cod){
            case 1: 
                System.out.print(cod + " - Caixa");
                break;
            case 2:
                System.out.print(cod + " - Financiamento");
                break;
            case 3:
                System.out.print(cod + " - Empréstimo");
                break;
            case 4:
                System.out.print(cod + " - Produtor Rural");
                break;
            case 5:
                System.out.print(cod + " - Abertura de Contas");
                break;
            case 6:
                System.out.print(cod + " - Falar com o Gerente");
                break;
            default:
                System.out.print(cod + " - Opção Inexistente");
                break;
        }
        num.close();
    } 
}

/*
    * Faça um programa em Java que recebe um código da entrada padrão (número
    * inteiro) que representa uma das seguintes opções de atendimento em uma
    * agência bancária:
    * 
    * 1 - Caixa
    * 2 - Financiamento
    * 3 - Empréstimo
    * 4 - Produtor Rural
    * 5 - Abertura de Contas
    * 6 - Falar com o Gerente
    * 
    * O programa deve imprimir na saída padrão o texto da opção selecionada, usando
    * a formatação "código" - "texto da opção".
    * 
    * Caso o código lido não corresponda a uma das opções acima, imprimir
    * "X - Opção Inexistente", em que X é o código de entrada informado.
*/

