package com.adrian.pratica_11.Ex03;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> removerImpares(ArrayList<Integer> value) {
        ArrayList<Integer> par = new ArrayList<>();
        for(int i=0; i<value.size(); i++)
        {
            if(value.get(i) % 2 == 0)
            {
                par.add(value.get(i));
            }
        }
        return par;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        /* -------------------------------------------- */
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        /* -------------------------------------------- */
        // input.add(1);
        // input.add(13);
        // input.add(3);
        // input.add(17);
        // input.add(5);
        /* -------------------------------------------- */
        // input.add(2);
        // input.add(4);
        // input.add(6);
        // input.add(8);
        // input.add(10);
        /* -------------------------------------------- */
        //input.add(1);
        /* -------------------------------------------- */
        //input.add(2);
        /* -------------------------------------------- */
        input = removerImpares(input);
        /* -------------------------------------------- */
        for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }
    }
}
