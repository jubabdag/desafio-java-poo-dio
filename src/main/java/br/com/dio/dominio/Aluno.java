package br.com.dio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Aluno {
  private String nome;
  private Set<Conteudo> disciplinasMatriculadas = new LinkedHashSet<>();
  private Set<Conteudo> disciplinasConcluidas = new LinkedHashSet<>();

  public void inscreverDisciplina(Semestre curso) {
    this.disciplinasMatriculadas.addAll(curso.getConteudos());
    curso.getAlunosMatriculados().add(this);
  }

  public void concluirDisciplina() {
    Optional<Conteudo> conteudo = this.disciplinasMatriculadas.stream().findFirst();
    if(conteudo.isPresent()) {
      this.disciplinasConcluidas.add(conteudo.get());
      this.disciplinasMatriculadas.remove(conteudo.get());
    }else {
      System.out.println("Você não está matriculado em nenhuma disciplina!");
    }
  } 

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getDisciplinasMatriculadas() {
    return disciplinasMatriculadas;
  }

  public void setDisciplinasMatriculadas(Set<Conteudo> disciplinasMatriculadas) {
    this.disciplinasMatriculadas = disciplinasMatriculadas;
  }

  public Set<Conteudo> getDisciplinasConcluidas() {
    return disciplinasConcluidas;
  }

  public void setDisciplinasConcluidas(Set<Conteudo> disciplinasConcluidas) {
    this.disciplinasConcluidas = disciplinasConcluidas;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, disciplinasMatriculadas, disciplinasConcluidas);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(disciplinasMatriculadas, aluno.disciplinasMatriculadas) && Objects.equals(disciplinasConcluidas, aluno.disciplinasConcluidas);
  }

  @Override
  public String toString() {
    return "Aluno {" + nome + ", disciplinasMatriculadas = " + disciplinasMatriculadas + ", disciplinasConcluidas = " + disciplinasConcluidas + "}";
  }
}
