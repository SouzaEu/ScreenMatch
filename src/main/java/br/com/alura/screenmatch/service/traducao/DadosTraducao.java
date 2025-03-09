package br.com.alura.screenmatch.service.traducao;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public record DadosTraducao(@JsonAlias("translatedText") String textoTraduzido) {
    public String obterTextoTraduzido() {
        return textoTraduzido;
    }
}
