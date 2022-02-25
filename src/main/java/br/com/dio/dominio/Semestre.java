package br.com.dio.dominio;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Semestre {
  private Set<Aluno> alunosMatriculados = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();

  public Set<Aluno> getAlunosMatriculados() {
    return alunosMatriculados;
  }
  public void setAlunosMatriculados(Set<Aluno> alunosMatriculados) {
    this.alunosMatriculados = alunosMatriculados;
  }
  public Set<Conteudo> getConteudos() {
    return conteudos;
  }
  public void setConteudos(Set<Conteudo> conteudos) {
    this.conteudos = conteudos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Semestre semestre = (Semestre) o;
    return Objects.equals(alunosMatriculados, semestre.alunosMatriculados) && Objects.equals(conteudos, semestre.conteudos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alunosMatriculados, conteudos);
  }
}
