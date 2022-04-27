package com.adrian.pratica_06.Ex02;

public class Main 
{
    public static void main(String[] args) {
        Carro carro1 = new Carro(0, null, null, 0, 0);
        carro1.setRenavam(123456789);
        carro1.setPlaca("AAA-1234");
        carro1.setCor("Preto");
        carro1.setNumeroDePortas(4);
        carro1.setPotenciaMotor(115);
        carro1.printInformacoes();
    }
}
