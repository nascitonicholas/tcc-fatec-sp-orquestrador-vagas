package br.com.fatec.sp.tcc.orquestradorvagas.v1.controller;

import br.com.fatec.sp.tcc.orquestradorvagas.v1.config.AbstractController;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.config.SaidaDefault;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.controller.response.VagasResponse;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.facade.VagasFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VagasController implements AbstractController<SaidaDefault> {

    @Autowired
    private VagasFacade vagasFacade;

    @GetMapping("/lista-vagas")
    public ResponseEntity<?> get() {
        List<VagasResponse> response = vagasFacade.get();
        return saidaSimplificada(SaidaDefault.builder().responseBody(response).message("Lista de Vagas retornadas").build(), HttpStatus.OK);
    }

}
