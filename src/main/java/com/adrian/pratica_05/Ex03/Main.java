package com.adrian.pratica_05.Ex03;

public class Main 
{
    public static void main(String[] args){
        int Receber = 1, Pagar = 0;
        Financeiro financeiro = new Financeiro();
        Lancamento lanc1 = new Lancamento(Receber, "Salario", 1000.99);
        Lancamento lanc2 = new Lancamento(Pagar, "Luz", 250.56);
        Lancamento lanc3 = new Lancamento(Pagar, "Água", 180.19);
        financeiro.processarLancamento(lanc1);
        financeiro.processarLancamento(lanc2);
        financeiro.processarLancamento(lanc3);
        financeiro.printSaldo();
    }
}
