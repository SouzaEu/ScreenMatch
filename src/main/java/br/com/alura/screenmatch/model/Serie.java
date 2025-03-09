package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.service.traducao.ConsultaMyMemoryAPI;

import java.util.OptionalDouble;

public class Serie {
    private String titulo;
    private Integer totalTemporadas;
    private Double avaliacao;
    private Categoria categoria;
    private String poster;
    private String sinopse;
    private String elenco;

    public Serie(DadosSerie dadosSerie) {
        titulo = dadosSerie.titulo();
        totalTemporadas = dadosSerie.totalTemporadas();
        avaliacao = OptionalDouble.of(Double.parseDouble(dadosSerie.avaliacao())).orElse(0);
        categoria = Categoria.fromString(dadosSerie.categoria().split(",")[0].trim());
        elenco = dadosSerie.elenco();
        poster = dadosSerie.poster();
        sinopse = ConsultaMyMemoryAPI.obterTraducao(dadosSerie.sinopse());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(Integer totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    @Override
    public String toString() {
        return "Serie: " +
                "titulo='" + titulo + '\'' +
                ", totalTemporadas=" + totalTemporadas +
                ", avaliacao=" + avaliacao +
                ", categoria=" + categoria +
                ", poster='" + poster + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", elenco='" + elenco + '\'' +
                '}';
    }
}
