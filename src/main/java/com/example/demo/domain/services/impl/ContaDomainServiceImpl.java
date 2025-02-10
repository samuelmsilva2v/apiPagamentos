package com.example.demo.domain.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.application.dtos.ContaRequestDto;
import com.example.demo.application.dtos.ContaResponseDto;
import com.example.demo.domain.services.interfaces.ContaDomainService;

@Service
public class ContaDomainServiceImpl implements ContaDomainService {

	@Override
	public ContaResponseDto cadastrarConta(ContaRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaResponseDto editarConta(UUID id, ContaRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String excluirConta(UUID id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaResponseDto consultarConta(UUID id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContaResponseDto> listarContas() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaResponseDto adicionarSaldo(UUID id, Double valor) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaResponseDto sacarSaldo(UUID id, Double valor) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
