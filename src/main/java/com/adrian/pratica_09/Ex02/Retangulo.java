package com.adrian.pratica_09.Ex02;

public class Retangulo implements AreaCalculavel{
    private double base, altura;

    public Retangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (altura*base);
    }
    
}
