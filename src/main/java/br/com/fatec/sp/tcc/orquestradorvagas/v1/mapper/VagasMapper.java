package br.com.fatec.sp.tcc.orquestradorvagas.v1.mapper;

import br.com.fatec.sp.tcc.orquestradorvagas.v1.controller.response.VagaResponse;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.response.OrquestradorBdResponse;
import br.com.fatec.sp.tcc.orquestradorvagas.v1.utils.Utils;
import org.mapstruct.*;

import java.util.ArrayList;
import java.util.List;

@Mapper(imports = {Utils.class})
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
            @Mapping(target = "enderecoCompleto", expression = "java(Utils.montaEndereco(vaga.getEndereco()))"),
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

}
