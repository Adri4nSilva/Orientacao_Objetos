package com.adrian.pratica_09.Ex03;

public class Main {
    public static void main(String[] args) {
        // Funcionario funcs[] = 
        // {
        // new Professor("Prof A", 52),
        // new Professor("Prof B", 42),
        // new Tecnico("Tec 1", 40),
        // new Estagiario("Est 1", 6)
        // };

        // for (int i = 0; i < funcs.length; i++) 
        // {
        // System.out.println(funcs[i].calcularSalario());
        // }

        // Funcionario funcs[] = 
        // {
        // new Professor("Prof A", 58.5),
        // new Tecnico("Tec 1", 160),
        // new Estagiario("Est 1", 80)
        // };

        // for (int i = 0; i < funcs.length; i++) 
        //{
        // System.out.println(funcs[i].calcularSalario());
        // }

        Funcionario funcs[] = 
        {
                new Professor("Prof A", 1),
                new Tecnico("Tec 1", 1),
                new Estagiario("Est 1", 1)
        };

        for (int i = 0; i < funcs.length; i++)
        {
            System.out.println(funcs[i].calcularSalario());
        }
    }
}
