package com.example.demo.domain.services.impl;

import org.springframework.stereotype.Service;

import com.example.demo.application.dtos.AutenticarUsuarioRequestDto;
import com.example.demo.application.dtos.AutenticarUsuarioResponseDto;
import com.example.demo.application.dtos.CriarUsuarioRequestDto;
import com.example.demo.application.dtos.CriarUsuarioResponseDto;
import com.example.demo.application.dtos.ObterDadosUsuarioResponseDto;
import com.example.demo.domain.services.interfaces.UsuarioDomainService;

@Service
public class UsuarioDomainServiceImpl implements UsuarioDomainService {

	@Override
	public CriarUsuarioResponseDto criarUsuario(CriarUsuarioRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AutenticarUsuarioResponseDto autenticarUsuario(AutenticarUsuarioRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObterDadosUsuarioResponseDto obterDadosUsuario(String token) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
