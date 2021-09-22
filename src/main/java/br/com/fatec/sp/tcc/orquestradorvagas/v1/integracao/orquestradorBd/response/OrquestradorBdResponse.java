package br.com.fatec.sp.tcc.orquestradorvagas.v1.integracao.orquestradorBd.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrquestradorBdResponse {

    @JsonProperty("data")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private List<VagasBd> responseBody = new ArrayList<>();

    @JsonProperty("message")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String  message;

    @JsonProperty("description")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String  description;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class VagasBd {

        @JsonProperty("id_vaga")
        private Long id;
        @JsonProperty("titulo")
        private String titulo;
        @JsonProperty("data_vencimento")
        private String dataVencimento;
        @JsonProperty("numero_vagas")
        private String numeroVagas;
        @JsonProperty("horario")
        private String horario;
        @JsonProperty("remuneracao")
        private String remuneracao;
        @JsonProperty("atividades")
        private String atividades;
        @JsonProperty("periodo_faculdade")
        private String periodoFaculdade;
        @JsonProperty("conhecimentos_informatica")
        private String conhecimentosInformatica;
        @JsonProperty("conhecimentos_linguas")
        private String conhecimentosLinguas;
        @JsonProperty("observacoes")
        private String observacoes;
        @JsonProperty("usuario")
        private Usuario usuarioResponsavel;

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Usuario {

        @JsonProperty("id")
        private Long id;
        @JsonProperty("nome")
        private String nome;
        @JsonProperty("email")
        private String email;
        @JsonProperty("senha")
        private String senha;
        @JsonProperty("cpf")
        private String cpf;
        @JsonProperty("rg")
        private String rg;
        @JsonProperty("telefone")
        private String telefone;
        @JsonProperty("celular")
        private String celular;
        @JsonProperty("data_criacao")
        private String dataCriacao;
        @JsonProperty("data_ultima_alteracao")
        private String dataUltimaAlteracao;

    }

}