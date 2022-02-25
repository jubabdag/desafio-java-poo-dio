package br.com.dio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Disciplina extends Conteudo {
  private String nome;
  private String sigla;
  private Set<Aluno> alunosMatriculados = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();

  public Disciplina() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSigla() {
    return sigla;
  }

  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

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
      Disciplina disciplina = (Disciplina) o;
      return Objects.equals(nome, disciplina.nome) && Objects.equals(sigla, disciplina.sigla) && Objects.equals(alunosMatriculados, disciplina.alunosMatriculados) && Objects.equals(conteudos, disciplina.conteudos);
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(nome, sigla, alunosMatriculados, conteudos);
  }

  @Override
  public String toString() {
    return "{" + nome  + ", sigla = " + sigla + "}";
  }
}
