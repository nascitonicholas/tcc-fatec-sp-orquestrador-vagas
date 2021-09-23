package br.com.fatec.sp.tcc.orquestradorvagas.v1.controller.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VagaResponse {

    @JsonProperty("id")
    private String  id;

    @JsonProperty("data_vencimento")
    private String  dataVencimento;

    @JsonProperty("tipo")
    private String  tipo;

    @JsonProperty("numero_vagas")
    private String  numeroVagas;

    @JsonProperty("endereco")
    private String  enderecoCompleto;

    @JsonProperty("horario")
    private String  horario;

    @JsonProperty("remuneracao")
    private String  remuneracao;

    @JsonProperty("beneficios")
    private String  beneficios;

    @JsonProperty("atividades")
    private String  atividades;

    @JsonProperty("periodo")
    private String  periodo;

    @JsonProperty("conhecimentos")
    private String  conhecimentos;

    @JsonProperty("linguas")
    private String  linguas;

    @JsonProperty("responsavel")
    private String  responsavel;

    @JsonProperty("telefone")
    private String  telefone;

    @JsonProperty("email")
    private String  email;

    @JsonProperty("observacao")
    private String  observacao;

}
