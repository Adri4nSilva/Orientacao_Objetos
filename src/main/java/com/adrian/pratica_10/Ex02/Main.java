package com.adrian.pratica_10.Ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float y=0, value[] = new float[10];
        int x=10; 
        for(int i=0; i<10; i++)
        {
            try 
            {
                value[i] = in.nextFloat();
            } 
            catch (InputMismatchException e)
            {
                x--;
                in.next();
            }
        }
        for(int i=0; i<10; i++)
        {
            y += value[i];
        }
        y /= 10;
        System.out.printf("Entradas aceitas: %d, média: %.2f", x, y);
        in.close();
    }
}