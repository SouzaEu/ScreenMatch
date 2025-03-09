package br.com.alura.screenmatch.service.traducao;

import br.com.alura.screenmatch.service.ConsumoApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URLEncoder;

public class ConsultaMyMemoryAPI {
    public static String obterTraducao(String text) {
        ObjectMapper mapper = new ObjectMapper();

        ConsumoApi consumo = new ConsumoApi();

        String texto = URLEncoder.encode(text);
        String langpair = URLEncoder.encode("en|pt-br");

        String url = "https://api.mymemory.translated.net/get?q=" + texto + "&langpair=" + langpair;

        String json = consumo.obterDados(url);


        DadosResposta resposta;
        try {
            resposta = mapper.readValue(json, DadosResposta.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return resposta.dadosTraducao().textoTraduzido();
    }
}
