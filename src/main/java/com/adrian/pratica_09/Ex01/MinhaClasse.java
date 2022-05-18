package com.adrian.pratica_09.Ex01;

public class MinhaClasse implements MinhaInterface{
    private String frase;

    @Override
    public void concatenar(String s) {
        this.frase = getFrase().concat(s);    
    }

    @Override
    public int tamanho() {
        return getFrase().length();
    }

    @Override
    public String getFrase() {
        return this.frase;
    }

    @Override
    public void setFrase(String frase) {
        this.frase = frase;
    }
    
}
