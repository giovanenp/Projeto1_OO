package br.com.exercicio3;

public class Aluno {
  private String nome;
  private int matricula;
  private double notaAV1;
  private double notaAV2;
  private double notaAE;
  private String curso;
  private int periodo;

  public Aluno(String nome, int matricula, String curso, int periodo) {
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
    this.periodo = periodo;
  }

  void alteraNotaAV1(double novaNotaAV1){
    this.notaAV1 = novaNotaAV1;
  }

  void alteraNotaAV2(double novaNotaAV2){
    this.notaAV2 = novaNotaAV2;
  }

  void alteranotaAE(double novaNotaAE){
    this.notaAE = novaNotaAE;
  }

  String avaliarAluno(){
    if(this.notaAV1 + this.notaAV2 >= 60) {
      return "Aprovado!";
    } else {
      return "Reprovado!";
    }
  }

  String avaliarRecuperacao(double notaAE){
    double notaMedia = ((this.notaAV1 + this.notaAV2) + notaAE) / 2;
    if(notaMedia >= 60) {
      return "Aprovado!";
    } else {
      return "Reprovado!";
    }
  }
}
