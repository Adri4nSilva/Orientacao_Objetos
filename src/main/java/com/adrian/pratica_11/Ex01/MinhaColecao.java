package com.adrian.pratica_11.Ex01;

import java.util.ArrayList;

public class MinhaColecao {
    ArrayList<String> input = new ArrayList<>();
    /* -------------------------------------------- */
    public void adicionar(String value)
    {
        if(input.contains(value)){}
        else
        {
            input.add(value);
        }
    }
    /* -------------------------------------------- */
    public void remover(String value)
    {
        input.remove(value);
    }
    /* -------------------------------------------- */
    public void imprimir()
    {
        if(input.isEmpty())
            System.out.println("Lista vazia!");
        else
        {
            /*1º maneira de ser feita:
            for(int i=0; i<input.size(); i++)
            {
                System.out.println((i+1)+"-"+input.get(i));
            }
            */
            /* -------------------------------------------- */
            //2º maneira:
            int i=1;
            for(String value : input)
            {
                System.out.println(i+"-"+value);
                i++;
            }
        }
    }
}