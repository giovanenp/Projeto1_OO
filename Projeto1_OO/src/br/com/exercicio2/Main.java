package br.com.exercicio2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){  
    String nome;
    double salario;
    int horasAula;
    try (Scanner entrada = new Scanner(System.in)) {
      System.out.print("Entre com o nome do empregado: ");
      nome = entrada.nextLine();
      System.out.print("Informe o valor do salario do empregado: ");
      salario = entrada.nextDouble();
      System.out.print("Informe a quantidade de hora/hora: ");
      horasAula = entrada.nextInt();
    }    

    EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade(nome, salario, horasAula);
    empregado.getGastos();
    System.out.print(empregado.getInfo());        
  }
}
