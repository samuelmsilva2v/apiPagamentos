package com.example.demo.domain.models.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "contas")
@Data
public class Conta {

	@Id
	private UUID id;
	private Usuario usuario;
	private BigDecimal saldo;
}
