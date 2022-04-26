package com.adrian.pratica_03;

import java.util.Scanner;

public class Ex03
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=0, e=0, i=0, o=0, u=0;

        while(true)
        {

            String frase = in.nextLine().toLowerCase();

            if(frase.equals("FIM"))
            {
                i++;
                break;
            }
            for(int k=0; k<frase.length(); k++)
            {
                switch (frase.charAt(k))
                {
                    case 'a':
                        a++;
                        break;
                    case 'e':
                        e++;
                        break;
                    case 'i':
                        i++;
                        break;
                    case 'o':
                        o++;
                        break;
                    case 'u':
                        u++;
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println("a="+a);
        System.out.println("e="+e);
        System.out.println("i="+i);
        System.out.println("o="+o);
        System.out.println("u="+u);

        in.close();
    }
}

/* 
    *Faça um programa em Java para ler um número arbitrário de strings (frases compostas por palavras e espaços em branco) da entrada padrão. A entrada não deve usar acentuação nas palavras! A leitura deve ser encerrada ao ler a string "FIM" (todas as letras maiúsculas). Na sequência, conte e imprima o número de vogais contidas nas strings recebidas da entrada padrão.

    *Dica 1: seu programa deve contar vogais em maiúsculo e minúsculo.
    *Dica 2: comparação de caracteres é diferente da comparação de string (usar método equals).
    *Dica 3: a saída do seu programa deve obedecer a formatação mostrada abaixo. 

    *testes: 
    *- eu/FIM = a=0; e=1; i=0; o=0; u=1
*/