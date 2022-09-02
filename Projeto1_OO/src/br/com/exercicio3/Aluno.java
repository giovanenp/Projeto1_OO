package br.com.exercicio3;

public class Aluno {
  private String nome;
  private int matricula;
  private float notaAV1;
  private float notaAV2;
  private float notaAE;
  private String curso;
  private int periodo;

  public Aluno(String nome, int matricula, String curso, int periodo) {
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
    this.periodo = periodo;
  }

  public void alteraNotaAV1(float nota) {
    this.notaAV1 = nota;
  }

  public void alteraNotaAV2(float nota) {
    this.notaAV2 = nota;
  }

  public void alteranotaAE(float nota) {
    this.notaAE = nota;
  }

  public String avaliarAluno() {
    if (this.notaAV1 + this.notaAV2 >= 60) {
      return "Aprovado!";
    } else {
      return "Recuperação!";
    }
  }

  public String avaliarRecuperacao() {
    if (((this.notaAV1 + this.notaAV2 + this.notaAE) / 2) >= 60) {
      return "Aprovado!";
    } else {
      return "Reprovado!";
    }
  }

  public String getInfoAluno() {
    return "Aluno: " + this.nome + "\nMatricula: " + this.matricula + "\nCurso: " + this.curso + "\nPeriodo: "
        + this.periodo + "\nNota AV1: " + this.notaAV1 + "\nNota AV2: " + this.notaAV2 + "\nNota AV3: " + this.notaAE;
  }
}
