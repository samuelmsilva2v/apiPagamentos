package com.example.demo.domain.models.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import com.example.demo.domain.models.enums.StatusTransacao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "transacoes")
@Data
public class Transacao {

	@Id
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "pagador_id", nullable = false)
	private Usuario pagador;

	@ManyToOne
	@JoinColumn(name = "recebedor_id", nullable = false)
	private Usuario recebedor;
	private BigDecimal valor;
	private StatusTransacao status;
	private Date dataCriacao;
}
