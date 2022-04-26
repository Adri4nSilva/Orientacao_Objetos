package com.adrian.pratica_05.Ex02;

public class Pessoa 
{
    private String nome;
    private double altura;
    private double peso;
    //══════════⊹⊱❖⊰⊹════════════
    public Pessoa(String name, double alt, double Peso)
    {
        this.nome = name;
        this.altura = alt;
        this.peso = Peso;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void peso(double Peso)
    {
        this.peso = Peso;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public String getNome()
    {
        return nome;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public double getAltura()
    {
        return altura;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public double getPeso()
    {
        return peso;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setNome(String name)
    {
        this.nome = name;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setAltura(double alt)
    {
        this.altura = alt;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setPeso(double Peso)
    {
        this.peso = Peso;
    }
}

