package com.adrian.pratica_04;

public class ex02 {
    public static int procuraMaiorValor(int vetor[])
    {
        int maior = 0;
        for(int i=0; i<vetor.length; i++)
        {
            if(vetor[i] > maior)
            {
                maior = vetor[i];
            }
        }
        return maior;
    }
    public static void main(String[] args) {
        int vetor[] = {1, -2, 3, 4, -5, 6, -7};
        int maior = procuraMaiorValor(vetor);
        System.out.println(maior);
    }
}
