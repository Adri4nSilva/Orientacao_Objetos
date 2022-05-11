package com.adrian.pratica_08.Ex02;

public class AlunoMestrado extends Aluno{
    private double notaDissertacao;
    private int artigosPublicados;
    //══════════⊹⊱❖⊰⊹════════════
    public AlunoMestrado(String nome, int ra, double notaDisciplinas, double notaDissertacao, int artigosPublicados)
    {   
        this.setNome(nome);
        this.setRa(ra);
        this.setNotaDisciplinas(notaDisciplinas);
        this.notaDissertacao = notaDissertacao;
        this.artigosPublicados = artigosPublicados;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public double getNotaDissertacao()
    {
        return this.notaDissertacao;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setNotaDissertacao(double notaDissertacao)
    {
        this.notaDissertacao = notaDissertacao;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public int getArtigosPublicados()
    {
        return this.artigosPublicados;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setArtigosPublicados(int artigosPublicados)
    {
        this.artigosPublicados = artigosPublicados;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public double getNotaFinal()
    {
        if(getArtigosPublicados() == 0)
            return 0;
        else
            return ((getNotaDisciplinas() + getNotaDissertacao())/2);
    }
}