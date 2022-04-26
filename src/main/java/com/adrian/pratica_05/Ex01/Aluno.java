package com.adrian.pratica_05.Ex01;

public class Aluno 
{
    String nome = "Aluno";
    int idade = 18;  
    char genero;
    long ra = 123456789;
    //══════════⊹⊱❖⊰⊹════════════
    public Aluno()
    {
        nome = "Aluno";
        idade = 18;
        genero = 'M';
        ra = 123456789;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public Aluno(String name, int age) //construtor 2
    {
        nome = name;
        idade = age;
        genero = 'M';
        ra = 123456789;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public Aluno(String name, char gen, long Ra) //construtor 3
    {
        nome = name;
        idade = 18;
        genero = gen;
        ra = Ra;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void print()
    {
        System.out.print(nome + " - " + idade + " - " + genero + " - " + ra + "\n");
    }
}


