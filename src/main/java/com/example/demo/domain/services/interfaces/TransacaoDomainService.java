package com.example.demo.domain.services.interfaces;

import java.util.List;
import java.util.UUID;

import com.example.demo.application.dtos.TransacaoRequestDto;
import com.example.demo.application.dtos.TransacaoResponseDto;

public interface TransacaoDomainService {

	TransacaoResponseDto registrarTransacao(TransacaoRequestDto request) throws Exception;
	
	TransacaoResponseDto consultarTransacao(UUID id) throws Exception;
	
	List<TransacaoResponseDto> consultarTransacoesUsuario(UUID usuarioId) throws Exception;
}
