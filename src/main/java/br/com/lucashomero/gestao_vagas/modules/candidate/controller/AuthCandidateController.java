package br.com.lucashomero.gestao_vagas.modules.candidate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucashomero.gestao_vagas.modules.candidate.dto.AuthCandidateRequestDTO;
import br.com.lucashomero.gestao_vagas.modules.candidate.useCases.AuthCandidateUseCase;

@RestController
@RequestMapping("/auth")
public class AuthCandidateController {
	
	@Autowired
	private AuthCandidateUseCase authCandidateUseCase;
	
	@PostMapping("/candidate")
	public ResponseEntity<Object> auth(@RequestBody AuthCandidateRequestDTO authCandidateRequestDTO) {
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
