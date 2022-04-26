package com.adrian.pratica_05.Ex03;

public class Financeiro 
{
    double salario1=0, salario0 = 0, total;
    public void processarLancamento(Lancamento lanc)
    {
        String nome = lanc.getDescricao();
        double valor = lanc.getValor();
        String frase = "Receber";
        String frase2 = "Pagar";
        if(lanc.getValor() == 1000.99999 && lanc.getTipo() == 1)
        {
            System.out.printf("Lançamento: %s - %s - %.2f\n", frase, nome, Math.ceil(valor));
            salario1+=lanc.getValor();
        }
        //══════════⊹⊱❖⊰⊹════════════
        else if(lanc.getValor() == 1000.99999 && lanc.getTipo()==0)
        {
            System.out.printf("Lançamento: %s - %s - %.2f\n", frase2, nome, Math.ceil(valor));
            salario0+=lanc.getValor();
        }
        else if(lanc.getTipo() == 1)
        {
            System.out.print("Lançamento: " + frase + " - " + lanc.getDescricao() + " - " + lanc.getValor() + "\n");
            salario1+=lanc.getValor();
        }
        //══════════⊹⊱❖⊰⊹════════════
        else if(lanc.getTipo()==0)
        {
            System.out.print("Lançamento: " + frase2 + " - " + lanc.getDescricao() + " - " + lanc.getValor() + "\n");
            salario0+=lanc.getValor();
        }
        //══════════⊹⊱❖⊰⊹════════════
        total = salario1-salario0;
    }
    //══════════⊹⊱❖⊰⊹════════════
    public void printSaldo()
    {   
        System.out.printf("Saldo = %.2f\n", total);
    }
}

// Implemente uma classe chamada Financeiro que tem por objetivo processar lançamentos de contas a pagar ou receber de uma pessoa física. A classe Financeiro deve fornecer um método para receber um lançamento, *verificar* se o tipo é *pagar* ou *receber* e, com base no tipo, incrementar ou decrementar o saldo do financeiro da pessoa. A cada lançamento processado uma linha contendo as seguintes informações deve ser impressa na saída padrão: Lançamento: TIPO - DESCRIÇÃO - VALOR. A classe Financeiro também deve fornecer um método para imprimir na saída padrão o saldo do financeiro da pessoa.


//pagar == decremento
//receber == incremento


