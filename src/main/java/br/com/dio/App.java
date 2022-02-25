package br.com.dio;

import br.com.dio.dominio.Aluno;
import br.com.dio.dominio.Semestre;
import br.com.dio.dominio.Disciplina;

public class App {
    
    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Banco de Dados SQL");
        disciplina1.setSigla("BDA1");
        
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("JavaI");
        disciplina2.setSigla("JAV1");

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setNome("Rede de Computadores");
        disciplina3.setSigla("REC2");

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setNome("Arquitetura Cloud");
        disciplina4.setSigla("ACL5");

        Disciplina disciplina5 = new Disciplina();
        disciplina5.setNome("Algoritmos Avançados");
        disciplina5.setSigla("AAV1");
        
        Disciplina disciplina6 = new Disciplina();
        disciplina6.setNome("Arquitetura API");
        disciplina6.setSigla("API4");

        Disciplina disciplina7 = new Disciplina();
        disciplina7.setNome("Inteligência Artificial");
        disciplina7.setSigla("IAR2");

        Disciplina disciplina8 = new Disciplina();
        disciplina8.setNome("Aprendizagem de Máquina");
        disciplina8.setSigla("AMA5");
        
        Semestre semestre1 = new Semestre();
        semestre1.getConteudos().add(disciplina1);
        semestre1.getConteudos().add(disciplina2);
        semestre1.getConteudos().add(disciplina3);
        semestre1.getConteudos().add(disciplina4);

        Semestre semestre2 = new Semestre();
        semestre2.getConteudos().add(disciplina5);
        semestre2.getConteudos().add(disciplina6);
        semestre2.getConteudos().add(disciplina7);
        semestre2.getConteudos().add(disciplina8);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Juvenal");
        aluno1.inscreverDisciplina(semestre1);
        aluno1.concluirDisciplina();
        aluno1.concluirDisciplina();

        System.out.println(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Camila");
        aluno2.inscreverDisciplina(semestre1);
        aluno2.inscreverDisciplina(semestre2);
        aluno2.concluirDisciplina();
        aluno2.concluirDisciplina();
        aluno2.concluirDisciplina();
        System.out.println(aluno2);
    }
}
