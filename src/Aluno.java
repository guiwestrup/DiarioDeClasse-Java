
import java.util.Date;

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
    private Date nascimento;

    public Aluno(String nome, int matricula, Date nascimento) 
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

    public Date getNascimento() 
    {
        return nascimento;
    }

    public void setNascimento(Date nascimento) 
    {
        this.nascimento = nascimento;
    }
    
}
