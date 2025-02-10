package com.example.demo.domain.services.interfaces;

import java.util.List;
import java.util.UUID;

import com.example.demo.application.dtos.ContaRequestDto;
import com.example.demo.application.dtos.ContaResponseDto;

public interface ContaDomainService {

	ContaResponseDto cadastrarConta(ContaRequestDto request) throws Exception;
	
	ContaResponseDto editarConta(UUID id, ContaRequestDto request) throws Exception;
	
	String excluirConta(UUID id) throws Exception;
	
	ContaResponseDto consultarConta(UUID id) throws Exception;
	
	List<ContaResponseDto> listarContas() throws Exception;
	
	ContaResponseDto adicionarSaldo(UUID id, Double valor) throws Exception;
	
	ContaResponseDto sacarSaldo(UUID id, Double valor) throws Exception;
}
