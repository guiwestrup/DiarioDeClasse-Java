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
public class Aluno 
{
    private String nome;
    private int matricula;
    private String nascimento;

    public Aluno(String nome, int matricula, String nascimento) 
    {
        this.nome = nome;
        this.matricula = matricula;
        this.nascimento = nascimento;
    }

    
    
    //Getters and Setters
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getMatricula() 
    {
        return matricula;
    }

    public void setMatricula(int matricula) 
    {
        this.matricula = matricula;
    }

    public String getNascimento() 
    {
        return nascimento;
    }

    public void setNascimento(String nascimento) 
    {
        this.nascimento = nascimento;
    }
    
}
