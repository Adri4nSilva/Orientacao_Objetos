package com.adrian.pratica_07.Ex03;

//gerente pode se autenticar em qualquer sistema
//vendedor pode se autenticar apenas em sistema de acesso nao restrito

public class Autenticador {
    String registros[][] = {{"joao", "123"}, {"maria","abc"},{"raul","xyz"}};
    //══════════⊹⊱❖⊰⊹════════════
    public boolean autenticar(Usuario usuario, boolean cod)
    {
        if(usuario instanceof Gerente)
        {
            Gerente gerente = (Gerente) usuario;
            for(int i=0; i<3; i++)
            {
                registros[i][0] = gerente.getLogin();
                registros[i][1] = gerente.getPassword();
                if(cod == true)
                    return false;
                else if(cod == false)
                    return true;
            }
        }
        else if(usuario instanceof Vendedor)
        {
            if(cod == true)
                return false;
            for(int i=0; i<3; i++)
            {
                if(usuario.getLogin().equals(registros[i][0]))
                    if(usuario.getPassword().equals(registros[i][1]))
                        if(cod == false)
                            return true;
            }
        }
        return false;
    } 
}