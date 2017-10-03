/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gui1_
 */
public class Interface 
{
 
    private Diario diario; 
    private Scanner input;
    private HashMap<Integer, List<Exame>> exames; //exame é uma lista porque existe vários notas/exames para apenas 1 aluno
    private HashMap<Integer,Aluno> alunos;
    //Contrutor inicializando o input apenas
    public Interface() 
    { 
         input = new Scanner(System.in); 
         input.useDelimiter("\\n"); 
    } 

    public void execucao()
    {
        boolean sair = false;
        iniciaDiario();
        while(!sair)
        {
            String opcao = imprimirOpcoes();
                switch(opcao)
                {
                    case "1":
                        addAluno();
                        break;
                    case "2":
                        addExame();
                        break;
                    case "3":
                        listarNotas();
                        break;
                    case "s":
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

        }
    }
    //Imprime as opções ao Usuário
    private String imprimirOpcoes() 
    {
        limpa();
        System.out.println("__________________________________");
        System.out.println("Diário de Classe"
                + "\nDisciplina: "+diario.getDisciplina());
        System.out.println();
        System.out.println("1: Adicionar Aluno");
        System.out.println("2: Adicionar Exame");
        System.out.println("3: Listar notas dos Alunos");
        System.out.println("4: Mostra Diário");
        System.out.println("S: Sair");
        
        return input.next().toLowerCase(); 
    }
    //Método para adicionar novo Aluno
    private void addAluno() 
    {
        System.out.println("-Cadastro de Aluno-");
        System.out.println("Nome do Aluno:");
        String nome = input.next();
        System.out.println("Matrícula do Aluno: ");
        int matricula = input.nextInt();
        System.out.println("Digite a data de nascimento: (Formato DD/MM/AAAA");
        String data = input.nextLine();
        limpa();
        diario.addAluno(new Aluno(nome,matricula,data));
    }
    
    //Método para adicionar novo Exame
    private void addExame()
    {
        System.out.println("-Cadastro de Exame-");
        System.out.println();
        listaAluno();
        System.out.println();
        int matricula = getMatriculaAluno();
        System.out.println("Entre com a data do exame: ");
        String data = input.next();
        System.out.println("Entre com a nota: ");
        Double nota = input.nextDouble();
        
        diario.addExame(new Exame(diario.getAlunos().get(matricula),data,nota));
    }
    
    //Pergunta a matrícula
    private int getMatriculaAluno()
    {
        System.out.println("Digite a Matrícula do Aluno");
        return input.nextInt();
    }
    //Método para listar alunos
    private void listaAluno()
    {
        System.out.println("Alunos");
        
        for (Aluno aluno : diario.getAlunos().values())
        {
            System.out.println(aluno.getMatricula()+ " - "+aluno.getNome());
        }
    }
    //Lista as notas dos alunos
    private void listarNotas()
    {
        System.out.println("-Lista de notas-");
        System.out.println();
        listaAluno();
        System.out.println();
        int matricula = getMatriculaAluno();
        System.out.println("Notas do Aluno:" + diario.getAlunos().get(matricula).getNome());
        
        for (double nota : diario.getNotasAluno(matricula))
        {
            System.out.println(nota+ " ");
        }
        System.out.println();
    }
    //Método para ver o diário
    private void mostraDiario()
    {
        System.out.println("Diário de Classe");
        System.out.println("Disciplina: "+diario.getDisciplina());
        for (ArrayList<Exame> exames : diario.getDiario().values())
        {
            System.out.println(exames.get(0).getAluno().getNome() + "\t");
            for (Exame exame : exames)
            {
                System.out.println(exame.getNota() + "\t");
            }
            System.out.println();
        }
    }
    //Gambiarra funcional para limpar a tela by: Nathan
    private void limpa() 
    {

        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    //Inicialização do Diário
    private void iniciaDiario() 
    {
        System.out.println("Diário de Classe");
        System.out.println("Nome da disciplina:");
        String disciplina = input.next();
        
        diario = new Diario(disciplina);
    }




}
