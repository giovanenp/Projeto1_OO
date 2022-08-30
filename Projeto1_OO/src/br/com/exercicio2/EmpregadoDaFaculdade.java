package br.com.exercicio2;

public class EmpregadoDaFaculdade{
  private String nome;
  private double salario;
  private int horasAula;
  private int bonus;
  
  EmpregadoDaFaculdade(String nome, double salario, int horasAula){
    this.nome = nome;
    this.salario = salario;
    this.horasAula = horasAula;
  }

  double getGastos(){    
    this.bonus = this.horasAula * 40;
    return this.bonus;
  }

  String getInfo(){
    return "Empregado: " + this.nome + ". Salário + Bonus: " + (this.salario + this.bonus);
  }
}
