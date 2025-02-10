package com.example.demo.application.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class TransacaoRequestDto {

	private UUID contaOrigemId;
	private UUID contaDestinoId;
	private String valor;
	private String tipoTransacao;
}
