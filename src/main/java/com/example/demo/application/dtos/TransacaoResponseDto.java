package com.example.demo.application.dtos;

import java.util.Date;
import java.util.UUID;

import com.example.demo.domain.models.enums.StatusTransacao;

import lombok.Data;

@Data
public class TransacaoResponseDto {

	private UUID id;
	private UUID contaOrigemId;
	private UUID contaDestinoId;
	private Double valor;
	private Date dataHora;
	private StatusTransacao statusTransacao;
}
