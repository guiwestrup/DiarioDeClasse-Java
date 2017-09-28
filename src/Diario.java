
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gui1_
 */
public class Diario 
{
    HashMap<Integer, List<Exame>> exames; //exame é uma lista porque existe vários notas/exames para apenas 1 aluno
    HashMap<Integer,Aluno> alunos; //Então para cada aluno, há vários exames
    private String disciplina;

    public Diario(String disciplina) 
    {
        this.disciplina = disciplina;
        exames = new HashMap<>();
        alunos = new HashMap<>();
    }
    
    public void addAluno(Aluno aluno)
    {
        alunos.put(aluno.getMatricula(), aluno);
    }
    public void addExame(Exame exame)
    {
        int matricula = exame.getAluno().getMatricula();
        if (!exames.containsKey(matricula))
        {
            exames.put(matricula,new ArrayList<Exame>());    
        }
        exames.get(matricula).add(exame);
    }   
    
    public ArrayList<Double> getNotasAluno(int matricula) 
    {
        ArrayList<Double> notas = new ArrayList<Double>();
        for (Exame exame: exames.get(matricula))
        {
            notas.add(exame.getNota());
        }
        return notas;
    }
    
    
}
