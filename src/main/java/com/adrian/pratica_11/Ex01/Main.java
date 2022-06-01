package com.adrian.pratica_11.Ex01;

public class Main {
    public static void main(String[] args) {
        MinhaColecao colecao = new MinhaColecao();
        colecao.adicionar("Fusca");
        colecao.adicionar("Gol");
        colecao.adicionar("Corsa");
        colecao.adicionar("Fusca");
        colecao.remover("Fusca");
        colecao.imprimir();
        /* -------------------------------------------- */
        // MinhaColecao colecao = new MinhaColecao();
        // colecao.adicionar("Ferrari");
        // colecao.adicionar("Ferrari");
        // colecao.adicionar("Ferrari");
        // colecao.remover("Ferrari");
        // colecao.imprimir();
        /* -------------------------------------------- */
        // MinhaColecao colecao = new MinhaColecao();
        // colecao.adicionar("Fiesta");
        // colecao.adicionar("Vectra");
        // colecao.adicionar("Jetta");
        // colecao.remover("Jetta");
        // colecao.remover("Vectra");
        // colecao.remover("Fiesta");
        // colecao.imprimir();
    }
}
