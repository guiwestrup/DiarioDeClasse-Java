package Principal;


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
    HashMap<Integer, ArrayList<Exame>> exames; //exame é uma lista porque existe vários notas/exames para apenas 1 aluno
    HashMap<Integer,Aluno> alunos; //Então para cada aluno, há vários exames
    private String disciplina;

    public Diario(String disciplina) 
    {
        this.disciplina = disciplina;
        exames = new HashMap<>();
        alunos = new HashMap<>();
    }

    Diario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public ArrayList<String> getListAluno()
    {
        ArrayList<String> listaaluno = new ArrayList<String>();
        return listaaluno;
    }
    public HashMap<Integer, Aluno> getAlunos() 
    { 
         return alunos; 
    }
    
    public HashMap<Integer, ArrayList<Exame>> getDiario() 
    {
        return exames;
    }

    public String getDisciplina() 
    {
        return disciplina;
    }

    public void setDisciplina(String disciplina) 
    {
        this.disciplina = disciplina;
    }
    
    
}
