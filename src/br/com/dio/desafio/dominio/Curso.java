package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{


  private int cargaHoraria;

  public Curso() {
  }

  public Curso(String titulo, String descricao, int cargaHoraria) {
    super(titulo, descricao);
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * cargaHoraria;
  }

  public int calculaXp(){
    return 0;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso{" +
      "titulo='" + this.getTitulo() + '\'' +
      ", descricao='" + this.getDescricao() + '\'' +
      ", cargaHoraria=" + cargaHoraria +
      '}';
  }
}
