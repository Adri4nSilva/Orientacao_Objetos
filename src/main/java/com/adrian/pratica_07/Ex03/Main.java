package com.adrian.pratica_07.Ex03;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("joao", "123", 12000, 3000);
        Autenticador autenticador = new Autenticador();
        if (autenticador.autenticar(g1, false)) {
            System.out.println("Usuário autenticado!");
        } else {
            System.out.println("Login ou password incorretos!");
        }

        // Gerente g1 = new Gerente("joao", "aaa", 12000, 3000);
        // Autenticador autenticador = new Autenticador();
        // if (autenticador.autenticar(g1, true)) {
        // System.out.println("Usuário autenticado!");
        // } else {
        // System.out.println("Login ou password incorretos!");
        // }

        // Vendedor v1 = new Vendedor("maria", "abc", 5000);
        // Autenticador autenticador = new Autenticador();
        // if (autenticador.autenticar(v1, true)) {
        // System.out.println("Usuário autenticado!");
        // } else {
        // System.out.println("Login ou password incorretos!");
        // }

        // Vendedor v1 = new Vendedor("maria", "abc", 5000);
        // Autenticador autenticador = new Autenticador();
        // if (autenticador.autenticar(v1, false)) {
        // System.out.println("Usuário autenticado!");
        // } else {
        // System.out.println("Login ou password incorretos!");
        // }

        // Vendedor v2 = new Vendedor("raul", "aaa", 5000);
        // Autenticador autenticador = new Autenticador();
        // if (autenticador.autenticar(v2, false)) {
        // System.out.println("Usuário autenticado!");
        // } else {
        // System.out.println("Login ou password incorretos!");
        // }
    }
}
