package com.adrian.pratica_09.Ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado, base, altura;

        lado = scan.nextDouble();
        AreaCalculavel q = new Quadrado(lado);

        lado = scan.nextDouble();
        altura = scan.nextDouble();
        AreaCalculavel r = new Retangulo(lado, altura);

        base = scan.nextDouble();
        altura = scan.nextDouble();
        AreaCalculavel t = new Triangulo(base, altura);

        System.out.println(q.calcularArea());
        System.out.println(r.calcularArea());
        System.out.println(t.calcularArea());

        scan.close();
    }
}