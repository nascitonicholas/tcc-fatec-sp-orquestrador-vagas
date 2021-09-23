package br.com.fatec.sp.tcc.orquestradorvagas.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrquestradorVagasApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrquestradorVagasApplication.class, args);
	}

}
