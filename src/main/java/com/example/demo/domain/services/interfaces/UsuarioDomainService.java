package com.example.demo.domain.services.interfaces;

import com.example.demo.application.dtos.AutenticarUsuarioRequestDto;
import com.example.demo.application.dtos.AutenticarUsuarioResponseDto;
import com.example.demo.application.dtos.CriarUsuarioRequestDto;
import com.example.demo.application.dtos.CriarUsuarioResponseDto;
import com.example.demo.application.dtos.ObterDadosUsuarioResponseDto;

public interface UsuarioDomainService {

	CriarUsuarioResponseDto criarUsuario(CriarUsuarioRequestDto request) throws Exception;
	
	AutenticarUsuarioResponseDto autenticarUsuario(AutenticarUsuarioRequestDto request) throws Exception;
	
	ObterDadosUsuarioResponseDto obterDadosUsuario(String token) throws Exception;
}
