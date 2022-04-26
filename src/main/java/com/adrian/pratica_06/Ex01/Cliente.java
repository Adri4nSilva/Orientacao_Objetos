package com.adrian.pratica_06.Ex01;

public class Cliente extends Pessoa
{
    private double limiteCompra;   
    //══════════⊹⊱❖⊰⊹════════════
    public Cliente(String nome, String endereco, double limiteCompra)
    {
        super(nome, endereco);
        this.limiteCompra = limiteCompra;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public double getLimiteCompra()
    {
        return limiteCompra;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setLimiteCompra(double limiteCompra)
    {
        this.limiteCompra = limiteCompra;
    }
}
