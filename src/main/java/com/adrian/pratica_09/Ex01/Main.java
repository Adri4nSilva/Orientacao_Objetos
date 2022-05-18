package com.adrian.pratica_09.Ex01;

public class Main {
    public static void main(String[] args) {
        // String minhaFrase = "Aluno";
        // MinhaInterface myInterface = new MinhaClasse();
        // myInterface.setFrase(minhaFrase);
        // myInterface.concatenar(" de Programação OO");
        // int tam = myInterface.tamanho();
        // System.out.printf("Frase: %s, Tam: %d", myInterface.getFrase(), tam);

        String minhaFrase = "";
        MinhaInterface myInterface = new MinhaClasse();
        myInterface.setFrase(minhaFrase);
        myInterface.concatenar("Aluno de Programação");
        myInterface.concatenar(" Java");
        int tam = myInterface.tamanho();
        System.out.printf("Frase: %s, Tam: %d", myInterface.getFrase(), myInterface.tamanho());
    }
}