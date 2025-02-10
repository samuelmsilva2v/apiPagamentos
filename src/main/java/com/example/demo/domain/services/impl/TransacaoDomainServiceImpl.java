package com.example.demo.domain.services.impl;

import java.util.List;
import java.util.UUID;

import com.example.demo.application.dtos.TransacaoRequestDto;
import com.example.demo.application.dtos.TransacaoResponseDto;
import com.example.demo.domain.services.interfaces.TransacaoDomainService;

public class TransacaoDomainServiceImpl implements TransacaoDomainService {

	@Override
	public TransacaoResponseDto registrarTransacao(TransacaoRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransacaoResponseDto consultarTransacao(UUID id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransacaoResponseDto> consultarTransacoesUsuario(UUID usuarioId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
