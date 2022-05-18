package com.adrian.pratica_09.Ex02;

public class Triangulo implements AreaCalculavel{
    private double base, altura;

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double calcularArea() {
        return ((base*altura)/2);
    }
}
