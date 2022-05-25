package com.adrian.pratica_10.Ex03;

import java.util.Scanner;

public class Main {
    static String getTemperatura(double temperaturas[], int indice)
    {
        try
        {
            return ("Temperatura["+indice+ "]: "+temperaturas[indice]);
        }
        catch(Exception e)
        {
            return ("Erro! Dados da exceção: "+ e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperaturas[] = { 26.5, 25.3, 22, 20.5, 18, 15, 13.3 };
        int indice = entrada.nextInt();
        System.out.print(getTemperatura(temperaturas, indice));
        entrada.close();
    }
}
