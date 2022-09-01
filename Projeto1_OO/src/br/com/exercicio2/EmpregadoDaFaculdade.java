package br.com.exercicio2;

public class EmpregadoDaFaculdade {
  private String nome;
  private double salario;
  private int horasAula;

  EmpregadoDaFaculdade(String nome, double salario, int horasAula) {
    this.nome = nome;
    this.salario = salario;
    this.horasAula = horasAula;
  }

  double getGastos() {
    return this.salario + (this.horasAula * 40);
  }

  String getInfo() {
    return "Empregado: " + this.nome + ". Salário + Bonus: " + this.getGastos();
  }
}
