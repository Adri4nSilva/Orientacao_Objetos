package com.adrian.pratica_07.Ex02;

public class Aluno extends Pessoa{
    private int ra;
    private String disciplina;
    //══════════⊹⊱❖⊰⊹════════════
    public Aluno(String nome, int idade, int ra, String disciplina) 
    {
        super(nome, idade);
        this.ra = ra;
        this.disciplina = disciplina;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public String retornaDados() 
    {
        return super.retornaDados() + " -- " + this.getRa() + " -- " + this.getDisciplina();
    }
    //══════════⊹⊱❖⊰⊹════════════
    public int getRa()
    {
        return ra;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setRa(int ra)
    {
        this.ra = ra;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public String getDisciplina()
    {
        return disciplina;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setDisciplina(String disciplina)
    {
        this.disciplina = disciplina;
    } 
}
