package digitalinnovation.example.app.service;

import digitalinnovation.example.app.client.FeingClient;
import digitalinnovation.example.app.client.JavaHttpClient;
import digitalinnovation.example.app.client.RestTemplateClient;
import digitalinnovation.example.app.dto.MessageSend;
import digitalinnovation.example.app.dto.ResultBotTelegram;
import digitalinnovation.example.app.dto.ResultBotTelegramList;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Telegram {
    private RestTemplateClient restTemplateClient;
    private FeingClient feingClient;
    private JavaHttpClient javaHttpClient;

    public Telegram(RestTemplateClient restTemplateClient, FeingClient feingClient, JavaHttpClient javaHttpClient) {
        this.restTemplateClient = restTemplateClient;
        this.feingClient = feingClient;
        this.javaHttpClient = javaHttpClient;
    }

    public void enviarMensagem(MessageSend mensagem) {
        //HTTP CLIENT
        //ResultBotTelegram resultBotTelegramResponseEntity = javaHttpClient.enviarMensagem(mensagem);
        //RestTemplate
        //restTemplateClient.enviarMensagem(mensagem);

        //FeingClient
        ResponseEntity<ResultBotTelegram> resultBotTelegram = feingClient.enviarMensagem(mensagem);

    }

    public ResultBotTelegramList buscarAtualizacao() {
        //HTTP CLIENT
        //ResultBotTelegramList resultBotTelegramList = javaHttpClient.buscarAtualizacao();

        //RestTemplate
        //ResultBotTelegramList resultBotTelegramList1 = restTemplateClient.buscarAtualizacao();

        //FeingClient
        ResponseEntity<ResultBotTelegramList> resultBotTelegramList1 = feingClient.buscaratualizacao();
        return resultBotTelegramList1.getBody();
    }
}
