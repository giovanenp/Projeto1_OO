package br.com.exercicio3;

public class Aluno {
  private String nome;
  private int matricula;
  private double notaAV1;
  private double notaAV2;
  private double notaAE;
  private String curso;
  private int periodo;

  public Aluno(String nome, int matricula, double notaAV1, double notaAV2, double notaAE, String curso, int periodo) {
    this.nome = nome;
    this.matricula = matricula;
    this.notaAV1 = notaAV1;
    this.notaAV2 = notaAV2;
    this.notaAE = notaAE;
    this.curso = curso;
    this.periodo = periodo;
  }

  void alteraNotaAV1(int novaNota){
    this.notaAV1 = novaNota;
  }

  void alteraNotaAV2(int novaNota){
    this.notaAV2 = novaNota;
  }

  void alteranotaAE(int novaNota){
    this.notaAE = novaNota;
  }

  String avaliarAluno(){
    if(this.notaAV1 + this.notaAV2 >= 60) {
      return "Aprovado!";
    } else {
      return "Reprovado!";
    }
  }

  String avaliarRecuperacao(double notaAV1, double notaAV2, double notaAE){
    double notaMedia = (notaAV1 + notaAV2 + notaAE) / 3;
    if(notaMedia >= 60) {
      return "Aprovado!";
    } else {
      return "Reprovado!";
    }
  }
}
