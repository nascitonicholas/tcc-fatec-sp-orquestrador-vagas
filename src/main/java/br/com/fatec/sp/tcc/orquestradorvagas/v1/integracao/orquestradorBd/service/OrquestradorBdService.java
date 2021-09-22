package br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.service;

import br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.client.OrquestradorBdClient;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.response.OrquestradorBdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrquestradorBdService {

    @Autowired
    private OrquestradorBdClient orquestradorBdClient;

    public List<OrquestradorBdResponse.VagasBd> getListaVagas() {
        return orquestradorBdClient.getListaVagas().getResponseBody();
    }

}
