package br.com.exercicio3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String nome, curso;
    int matricula, periodo;
    double notaAV1, notaAV2, notaAE;
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Informe o nome do aluno: ");
    nome = entrada.nextLine();
    System.out.print("Informe o número da matricula do aluno: ");
    matricula = entrada.nextInt();
    System.out.print("Informe o curso que o aluno está cursando: ");
    entrada = new Scanner(System.in);
    curso = entrada.nextLine();
    System.out.print("Em qual periodo o aluno está: ");
    periodo = entrada.nextInt();

    Aluno aluno = new Aluno(nome, matricula, curso, periodo);
    
    System.out.print("Informe a nota da AV1: ");
    notaAV1 = entrada.nextDouble();
    aluno.alteraNotaAV1(notaAV1);
    System.out.print("Informe a nota da AV2: ");
    notaAV2 = entrada.nextDouble();
    aluno.alteraNotaAV2(notaAV2);
    
    System.out.println("==================================================================================");
    System.out.println(aluno.avaliarAluno());
    System.out.println("==================================================================================");    
    
    if(aluno.avaliarAluno() == "Reprovado!") {
      System.out.print("Informe a nota da Avaliação Especial do aluno: ");
      notaAE = entrada.nextDouble();  
      aluno.alteranotaAE(notaAE);
      System.out.println("==================================================================================");
      System.out.println(aluno.avaliarRecuperacao());
      System.out.println("==================================================================================");
    }
  }
}
