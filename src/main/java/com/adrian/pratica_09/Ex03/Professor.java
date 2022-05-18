package com.adrian.pratica_09.Ex03;

public class Professor implements Funcionario{
    private String funcao;
    private double CH;

    public Professor(String funcao, double CH)
    {
        this.funcao = funcao;
        this.CH = CH;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public double getCH() {
        return this.CH;
    }

    public void setCH(double CH) {
        this.CH = CH;
    }

    @Override
    public double calcularSalario(){
        return (getCH()*60);
    }
    
}
