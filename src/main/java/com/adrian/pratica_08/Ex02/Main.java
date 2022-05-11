package com.adrian.pratica_08.Ex02;

public class Main 
{
    public static void main(String[] args) {
        
        // Aluno alunos[] = new Aluno[4];
    
        // alunos[0] = new AlunoGraduacao("Jonas", 1234, 7.8, 10.0); // nome, ra, notadisciplinas, notatcc
        // alunos[1] = new AlunoGraduacao("Maria", 5522, 9.8, 7.0);
        // alunos[2] = new AlunoMestrado("Pedro", 3311, 7.5, 8.5, 0); // nome, ra, notadisciplinas, notadissertacao, artigos
        // alunos[3] = new AlunoMestrado("Patricia", 7098, 9.5, 9.5, 3);
        // for (int i=0; i<alunos.length; i++)
        // {
        //     System.out.printf("Aluno(a): %s, Nota Final: %.2f\n", alunos[i].getNome(), alunos[i].getNotaFinal());
        // }

        Pessoa pessoas[] = new Pessoa[4];

        pessoas[0] = new AlunoGraduacao("Jonas", 1234, 7.8, 10.0);
        pessoas[1] = new AlunoGraduacao("Maria", 5522, 9.8, 7.0);
        pessoas[2] = new AlunoMestrado("Pedro", 3311, 7.5, 8.5, 0);
        pessoas[3] = new AlunoMestrado("Patricia", 7098, 9.5, 9.5, 3);

        for(int i=0; i<pessoas.length; i++)
        {
            Aluno aluno = (Aluno) pessoas[i];
            System.out.printf("Aluno(a): %s, Nota Final: %.2f\n", aluno.getNome(), aluno.getNotaFinal());
        }
    }
}
