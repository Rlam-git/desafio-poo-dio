import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    Conteudo curso1 = new Curso("curso java","descrição curso java",8);
    Curso curso2 = new Curso("curso javascript","descrição curso javascript",8);
    System.out.println(curso1);
    System.out.println(curso2);

    Mentoria mentoria1 = new Mentoria("Mentoria de java","descrição mentoria java", LocalDate.now());
    System.out.println(mentoria1);

    BootCamp bootCamp = new BootCamp();
    bootCamp.setNome("Bootcamp Java Developer");
    bootCamp.setDescricao("descrição do bootcamp");
    bootCamp.getConteudos().add(curso1);
    bootCamp.getConteudos().add(curso2);
    bootCamp.getConteudos().add(mentoria1);

    Dev camila = new Dev();
    camila.setNome("Camila");
    camila.inscreverBootCamp(bootCamp);
    camila.progredir();
    System.out.println("Conteúdos incritos Camila: " + camila.getConteudosInscritos());
    System.out.println("Conteúdos concluidos Camila: " + camila.getConteudosConcluidos());
    System.out.println("XP Camila: " + camila.calcularXp());

    System.out.println("--------------------------------------------------------");

    Dev joao = new Dev();
    joao.setNome("João");
    joao.inscreverBootCamp(bootCamp);
    joao.progredir();
    joao.progredir();
    System.out.println("Conteúdos incritos João: " + joao.getConteudosInscritos());
    System.out.println("Conteúdos concluidos João: " + joao.getConteudosConcluidos());
    System.out.println("XP João: " + joao.calcularXp());





  }

}
