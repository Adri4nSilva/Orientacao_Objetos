package com.adrian.pratica_10.Ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value;
        try 
        {
            value = in.nextInt();
            System.out.println(value*2);
        }
        catch (InputMismatchException e) 
        {
            System.out.println("Entrada Incorreta: informe somente inteiros.");
        }
        in.close();
    }
}
