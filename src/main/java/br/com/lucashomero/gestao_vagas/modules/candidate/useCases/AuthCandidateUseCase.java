package br.com.lucashomero.gestao_vagas.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.lucashomero.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.lucashomero.gestao_vagas.modules.candidate.dto.AuthCandidateRequestDTO;

@Service
public class AuthCandidateUseCase  {

	@Autowired
	private CandidateRepository candidateRepository;
	
	public void execute(AuthCandidateRequestDTO authCandidateRequestDTO) {
		var candidate = this.candidateRepository.findByUsername(authCandidateRequestDTO.username())
												.orElseThrow(() -> {
													throw new UsernameNotFoundException("Username/password incorrect");
												});
												
				;
		
	}
}
