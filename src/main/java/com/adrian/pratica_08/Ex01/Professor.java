package com.adrian.pratica_08.Ex01;

public class Professor extends Pessoa
{
    private double salario;
    private String Nome;
    private String cpf;
    private String rg;
    //══════════⊹⊱❖⊰⊹════════════
    public double getSalario()
    {
        return this.salario;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public String getNome()
    {
        return this.Nome;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setNome(String nome)
    {
        this.Nome = nome;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public String getCpf()
    {
        return this.cpf;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public String getRg()
    {
        return this.rg;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setRg(String rg)
    {
        this.rg = rg;
    }
}
