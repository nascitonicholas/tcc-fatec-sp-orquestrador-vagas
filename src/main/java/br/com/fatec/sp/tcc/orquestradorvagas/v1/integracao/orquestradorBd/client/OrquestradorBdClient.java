package br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.client;

import br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.response.OrquestradorBdResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "orquestradorBdClient", url = "${orquestrador.bd.url}")
public interface OrquestradorBdClient {

    @GetMapping(value="/vagas", consumes = MediaType.APPLICATION_JSON_VALUE)
    OrquestradorBdResponse getListaVagas();
}
