package com.adrian.pratica_07.Ex03;

//gerente pode se autenticar em qualquer sistema
//vendedor pode se autenticar apenas em sistema de acesso nao restrito

public class Autenticador {
    String registros[][] = new String [3][2];
    boolean value = true;
    boolean Aux = false;
    //══════════⊹⊱❖⊰⊹════════════
    public boolean autenticar(Usuario usuario, boolean cod)
    {
        if(usuario instanceof Vendedor)
        {
            Vendedor vendedor = (Vendedor) usuario;
            for(int i=0; i<3; i++)
            {
                for(int j=0; j<2; j++)
                {
                    registros[i][j] = vendedor.getLogin();
                    registros[i][j] = vendedor.getPassword();
                    if(cod == true)
                    {
                        return Aux;
                    }
                    else if(cod == false)
                    {
                        return value;
                    }
                }
            }
        }
        else if(usuario instanceof Gerente)
        {
            Gerente gerente = (Gerente) usuario;
            for(int i=0; i<3; i++)
            {
                for(int j=0; j<2; j++)
                {
                    registros[i][j] = gerente.getLogin();
                    registros[i][j] = gerente.getPassword();
                    if(cod == true)
                    {
                        return Aux;
                    }
                    else if(cod == false)
                    {
                        return value;
                    }
                }
            }
        }
        return cod;
    }
} 