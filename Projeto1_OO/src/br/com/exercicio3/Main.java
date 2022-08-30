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
    System.out.print("Nota AV1: ");
    notaAV1 = entrada.nextDouble();
    System.out.print("Nota AV2: ");
    notaAV2 = entrada.nextDouble();
    System.out.print("Nota Avaliação Especial: ");
    notaAE = entrada.nextDouble();
    System.out.print("Informe o número da matricula do aluno: ");
    matricula = entrada.nextInt();
    System.out.print("Informe o curso que o aluno está cursando: ");
    entrada = new Scanner(System.in);
    curso = entrada.nextLine();
    System.out.print("Em qual periodo o aluno está: ");
    periodo = entrada.nextInt();

    Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, notaAE, curso, periodo);
    
    System.out.println("==================================================================================");
    System.out.println(aluno.avaliarAluno());
    System.out.println("==================================================================================");

    System.out.println("==================================================================================");
    System.out.println(aluno.avaliarRecuperacao(notaAV1, notaAV2, notaAE));
    System.out.println("==================================================================================");
  }
}
