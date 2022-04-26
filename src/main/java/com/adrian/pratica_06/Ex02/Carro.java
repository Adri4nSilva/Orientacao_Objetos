package com.adrian.pratica_06.Ex02;

public class Carro extends Veiculo
{
    private int numeroDePortas;
    private int potenciaMotor;
    //══════════⊹⊱❖⊰⊹════════════
    
    //══════════⊹⊱❖⊰⊹════════════
    public int getNumeroDePortas()
    {
        return numeroDePortas;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setNumeroDePortas(int numeroDePortas)
    {
        this.numeroDePortas = numeroDePortas;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public int getPotenciaMotor()
    {
        return potenciaMotor;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void setPotenciaMotor(int potenciaMotor)
    {
        this.potenciaMotor = potenciaMotor;
    }
    public void printInformacoes()
    {
        System.out.print("Renavam: " + this.getRenavam() + ", Placa: " + this.getPlaca() + ", Cor: "+ this.getCor() + ", NumeroDePortas: "+ numeroDePortas + ", PotenciaMotor: "+ potenciaMotor);
    }
}
