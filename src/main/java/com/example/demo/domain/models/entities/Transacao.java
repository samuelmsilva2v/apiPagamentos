package com.example.demo.domain.models.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "transacoes")
@Data
public class Transacao {

	@Id
	private UUID id;
	
	private Usuario pagador;
	private Usuario recebedor;
	
	private BigDecimal valor;
	
	// TODO private StatusTransacao status;
	
	private Date dataCriacao;
}
