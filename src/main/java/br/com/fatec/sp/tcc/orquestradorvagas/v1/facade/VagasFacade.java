package br.com.fatec.sp.tcc.orquestradorvagas.v1.facade;

import br.com.fatec.sp.tcc.orquestradorvagas.v1.controller.response.VagaResponse;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.response.OrquestradorBdResponse;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.service.OrquestradorBdService;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.mapper.VagasMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Component
public class VagasFacade {

    @Autowired
    private OrquestradorBdService orquestradorBdService;

    private VagasMapper mapper = Mappers.getMapper(VagasMapper.class);

    public List<VagaResponse> get() {
        try {
            List<OrquestradorBdResponse.VagasBd> listaVagas = orquestradorBdService.getListaVagas();
            return mapper.mapListaVagasBdResponseToListaVagasResponse(listaVagas);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Não foi possível obter a lista de vagas - Error : " + e.toString());
        }
    }
}
