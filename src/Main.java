import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    Conteudo curso1 = new Curso("curso java","descrição curso java",8);
    Curso curso2 = new Curso("curso javascript","descrição curso javascript",8);
    System.out.println(curso1);
    System.out.println(curso2);

    Mentoria mentoria1 = new Mentoria("Mentoria de java","descrição mentoria java", LocalDate.now());
    System.out.println(mentoria1);

  }

}
