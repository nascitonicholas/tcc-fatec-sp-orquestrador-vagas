package br.com.fatec.sp.tcc.orquestradorvagas.v1.mapper;

import br.com.fatec.sp.tcc.orquestradorvagas.v1.controller.response.VagasResponse;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.response.OrquestradorBdResponse;
import org.mapstruct.Named;

import java.util.ArrayList;
import java.util.List;

public interface VagasMapper {

    @Named("mapListaVagasBdResponseToListaVagasResponse")
    default List<VagasResponse> mapListaVagasBdResponseToListaVagasResponse(List<OrquestradorBdResponse.VagasBd> vagasBdResponse) {
        List<VagasResponse> response = new ArrayList<>();
        return response;
    }

}
