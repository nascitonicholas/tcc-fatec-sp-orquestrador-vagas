package br.com.fatec.sp.tcc.orquestradorvagas.v1.utils;

import br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.response.OrquestradorBdResponse;

public class Utils {

    public static String montaEndereco(OrquestradorBdResponse.Endereco endereco) {
        return String.format("%s, %s - %s, %s - %s, %s", endereco.getLogradouro(), endereco.getNumero(),
                                                         endereco.getComplemento(), endereco.getCep(),
                                                         endereco.getMunicipio(), endereco.getEstado().getNome());
    }

}
