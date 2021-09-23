package br.com.fatec.sp.tcc.orquestradorvagas.v1.mapper;

import br.com.fatec.sp.tcc.orquestradorvagas.v1.controller.response.VagaResponse;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.response.OrquestradorBdResponse;
import org.mapstruct.*;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface VagasMapper {

    @Mappings({
            @Mapping(target = "tipo", source = "vaga.tipoVaga.tipo"),
            @Mapping(target = "beneficios", constant = "-"),
            @Mapping(target = "periodo", source = "vaga.periodoFaculdade"),
            @Mapping(target = "conhecimentos", source = "vaga.conhecimentosInformatica"),
            @Mapping(target = "linguas", source = "vaga.conhecimentosLinguas"),
            @Mapping(target = "responsavel", source = "vaga.usuarioResponsavel.nome"),
            @Mapping(target = "telefone", source = "vaga.usuarioResponsavel.telefone"),
            @Mapping(target = "email", source = "vaga.usuarioResponsavel.email"),
            @Mapping(target = "observacao", source = "vaga.observacoes"),
    })
    VagaResponse mapVagaBdToVagaResponse (OrquestradorBdResponse.VagasBd vaga);

    @Named("mapListaVagasBdResponseToListaVagasResponse")
    default List<VagaResponse> mapListaVagasBdResponseToListaVagasResponse(List<OrquestradorBdResponse.VagasBd> vagasBdResponse) {
        List<VagaResponse> response = new ArrayList<>();
        vagasBdResponse.forEach(vaga -> {
            response.add(mapVagaBdToVagaResponse(vaga));
        });
        return response;
    }

    @AfterMapping
    @Named("afterMapVagaBdToVagaResponse")
    default void afterMapVagaBdToVagaResponse(@MappingTarget VagaResponse vagaResponse, OrquestradorBdResponse.VagasBd vaga) {
        String endereco = vaga.getEndereco().getLogradouro() + ", " + vaga.getEndereco().getNumero() + " - "
                        + vaga.getEndereco().getMunicipio() + ", " + vaga.getEndereco().getEstado();
        vagaResponse.setEnderecoCompleto(endereco);
    }

}
