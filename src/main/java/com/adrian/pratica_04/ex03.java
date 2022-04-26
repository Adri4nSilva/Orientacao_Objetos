package com.adrian.pratica_04;

import java.util.Scanner;

public class ex03 {
    public static void printDiagonalPrincipal(int matriz[][])
    {
        int i=0, j=0;
        for(i=0; i<matriz.length; i++)
        {
            for(j=0; j<matriz.length; j++)
            {
                if(i==j)
                {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tam = in.nextInt();
        int matriz[][] = new int[tam][tam];

        for(int i=0; i<tam; i++)
        {
            for(int j=0; j<tam; j++)
            {
                matriz[i][j] = in.nextInt();
            }
        }
        printDiagonalPrincipal(matriz);
        in.close();
    }
}
