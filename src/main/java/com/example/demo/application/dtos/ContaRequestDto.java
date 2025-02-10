package com.example.demo.application.dtos;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.Data;

@Data
public class ContaRequestDto {

	private UUID usuarioId;
    private BigDecimal saldoInicial;
}
