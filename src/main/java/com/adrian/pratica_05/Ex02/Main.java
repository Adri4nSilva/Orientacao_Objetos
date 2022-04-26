package com.adrian.pratica_05.Ex02;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("fulano", 1.80, 80);
        System.out.println(p1.getNome());
        System.out.println(p1.getAltura());
        System.out.println(p1.getPeso());
    }
}
