package Principal;


import java.lang.String;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gui1_
 */

public class Exame 
{
    private Aluno aluno;
    private String data;
    private double nota;

    public Exame(Aluno aluno, String data, double nota) 
    {
        this.aluno = aluno;
        this.data = data;
        this.nota = nota;
    }

    public Aluno getAluno() 
    {
        return aluno;
    }

    public void setAluno(Aluno aluno) 
    {
        this.aluno = aluno;
    }

    public String getData() 
    {
        return data;
    }

    public void setData(String data) 
    {
        this.data = data;
    }

    public double getNota() 
    {
        return nota;
    }

    public void setNota(double nota) 
    {
        this.nota = nota;
    }
    
    
    
}
