package com.adrian.pratica_07.Ex03;

public class Vendedor extends Usuario{
    private double comissao;
    //══════════⊹⊱❖⊰⊹════════════
    public Vendedor(String login, String password, double comissao)
    {
        super.setLogin(login);
        super.setPassword(password);
        this.comissao = comissao;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public double getComissao()
    {
        return comissao;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setComissao(double comissao)
    {
        this.comissao = comissao;
    }
}