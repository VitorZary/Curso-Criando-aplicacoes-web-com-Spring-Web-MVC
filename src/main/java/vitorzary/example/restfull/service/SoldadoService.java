package vitorzary.example.restfull.service;

import org.springframework.stereotype.Service;
import vitorzary.example.restfull.controller.request.SoldadoEditRequest;
import vitorzary.example.restfull.dto.Soldado;

import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf) {
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e flecha");
        return soldado;
    }

    public void criarSoldado(Soldado soldado){

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {
    }

    public void deletarSoldado(String cpf) {

    }

    public List<Soldado> buscarAllSoldado() {
        Soldado soldado1 = new Soldado();
        soldado1.setCpf("123456789");
        soldado1.setNome("Legolas");
        soldado1.setRaca("Elfo");
        soldado1.setArma("Arco e flecha");

        Soldado soldado2 = new Soldado();
        soldado2.setCpf("987654321");
        soldado2.setNome("Andreia");
        soldado2.setRaca("Humano");
        soldado2.setArma("Machado de batalha");

        Soldado soldado3 = new Soldado();
        soldado3.setCpf("654321987");
        soldado3.setNome("Vitor");
        soldado3.setRaca("Orc");
        soldado3.setArma("Espada e Escudo");

        return Arrays.asList(soldado1, soldado2, soldado3);
    }
}
