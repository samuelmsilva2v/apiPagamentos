package com.example.demo.application.dtos;

import lombok.Data;

@Data
public class ObterDadosUsuarioResponseDto {

	private String nome;
	private String email;
	private String telefone;
	private String token;
	private String dataHoraAcesso;
}
