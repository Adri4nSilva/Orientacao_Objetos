package com.adrian.pratica_11.Ex02;

import java.util.ArrayList;

public class Loja {
    ArrayList<Produto> input = new ArrayList<>();
    /* -------------------------------------------- */
    public void adicionar(Produto p)
    {
        input.add(p);
    }
    /* -------------------------------------------- */
    public Produto getProdutoMaisCaro()
    {
        Produto p = new Produto("roupa", 0.0);
        for(int i=0; i<input.size(); i++)
        {
            if(input.get(i).getPreco() > p.getPreco())
            {
                p = input.get(i);
            }
        }
        return p;
    }
    public Produto getProdutoMenosCaro()
    {
        Produto x = new Produto("roupa", 1000.0);
        for(int i=0; i<input.size(); i++)
        {
            if(input.get(i).getPreco() < x.getPreco())
            {
                x = input.get(i);
            }
        }
        return x;
    }
}