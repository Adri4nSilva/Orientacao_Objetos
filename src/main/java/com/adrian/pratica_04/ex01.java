package com.adrian.pratica_04;

import java.util.Scanner;

public class ex01 {
    public static double maior(double n1, double n2, double n3, double n4)
    {
        double valor = 0;
        if((n1>n2 && n1>n3 && n1>n4) || (n1==n2 && n1==n3 && n1==n4))
        {
            return n1;
        }
        if((n2>n1 && n2>n3 && n2>n4) || (n2==n1 && n2==n3 && n1>n4))
        {
            return n2;
        }
        if((n3>n1 && n3>n2 && n3>n4) || (n3==n1 && n3>n2 && n3>n4))
        {
            return n3;
        }
        if((n4>n1 && n4>n2 && n4>n3) || (n4==n1 && n4==n2 && n4==n3))
        {
            return n4;
        }
        
        return valor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1=0, n2=0, n3=0, n4=0;
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();
        n4 = in.nextDouble();

        double n = maior(n1,n2,n3,n4);
        System.out.printf("%.1f", n);

        in.close();
    }
}


// package com.adrian.pratica_04;

// import java.util.Scanner;

// public class ex01 {
//     public static double quadrado(double numero)
//     {
//         return numero * numero;
//     }
//     public static double maior(double a, double b)
//     {
//         return a > b ? a : b;
//     }
//     public static double menor(double a, double b)
//     {
//         return a > b ? b : a;
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         double n1=0, n2=0;
//         n1=in.nextDouble();
//         n2=in.nextDouble();
//         System.out.printf("Maior: %.1f\n", maior(n1, n2));
//         System.out.printf("Menor: %.1f\n", menor(n1, n2));
//         System.out.printf("Quadrado n1: %.1f. Quadrado n2 %.1f", quadrado(n1), quadrado(n2));
//     }
// }