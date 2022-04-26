package com.adrian.pratica_07.Ex01;

public class DetalheVeiculos 
{
    String nome[] = new String[4];
    String placa[] = new String[4];
    String cor[] = new String[4];
    int rodas[] = new int[4];

    public DetalheVeiculos(Veiculo veiculos[]) 
    {
        for (int i = 0; i < veiculos.length; i++) 
        {
            
            if (veiculos[i] instanceof Carro) {
                nome[i] = "Carro";
                Carro carro = (Carro) veiculos[i];
                placa[i] = carro.getPlaca();
                cor[i] = carro.getCor();
                rodas[i] = carro.getRodas();
            } 
            else if (veiculos[i] instanceof Moto) 
            {
                Moto moto = (Moto) veiculos[i];
                placa[i] = moto.getPlaca();
                cor[i] = moto.getCor();
                rodas[i] = moto.getRodas();
                nome[i] = "Moto";
            }
        }
    }
    // ══════════⊹⊱❖⊰⊹════════════
    public void printVeiculos() {
        for(int i=0; i<4; i++)
        {
            System.out.println(nome[i]+": " + placa[i] + " - " + cor[i] + " - " + rodas[i]);
        }
    }
}
