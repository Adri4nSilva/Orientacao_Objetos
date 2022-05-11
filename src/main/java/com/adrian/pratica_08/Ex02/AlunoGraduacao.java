package com.adrian.pratica_08.Ex02;

public class AlunoGraduacao extends Aluno{
    private double notaTCC;
    //══════════⊹⊱❖⊰⊹════════════
    public AlunoGraduacao(String nome, int ra, double notaDisciplinas, double notaTCC)
    {
        this.setNome(nome);
        this.setRa(ra);
        this.setNotaDisciplinas(notaDisciplinas);
        this.notaTCC = notaTCC;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public double getNotaTCC()
    {
        return this.notaTCC;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setNotaTCC(double notaTCC)
    {
        this.notaTCC = notaTCC;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public double getNotaFinal()
    {
        return((getNotaTCC() + getNotaDisciplinas())/2);
    }
}