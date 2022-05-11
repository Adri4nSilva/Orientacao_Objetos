package com.adrian.pratica_08.Ex01;

public class Main {
    public static void main(String[] args) {
        // Professor p1 = new Professor();
        // p1.setNome("Fulano");
        // p1.setCpf("12345678901");
        // p1.setRg("5321789-0");
        // p1.setSalario(5000.0);
        // System.out.printf("Nome: %s\n", p1.getNome());
        // System.out.printf("CPF: %s\n", p1.getCpf());
        // System.out.printf("RG: %s\n", p1.getRg());
        // System.out.printf("Salario: %.2f\n", p1.getSalario());

        Professor p1 = new Professor();
        p1.setNome("Fulano");
        p1.setCpf("12345678901");
        p1.setRg("5321789-0");
        p1.setSalario(5000.0);
        Pessoa p2 = (Professor) p1;
        System.out.printf("Nome: %s\n", p2.getNome());
        System.out.printf("CPF: %s\n", p2.getCpf());
        System.out.printf("RG: %s\n", p2.getRg());
        System.out.printf("Salario: %.2f\n", ((Professor) p2).getSalario());
    }
}
