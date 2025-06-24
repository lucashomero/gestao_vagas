package br.com.lucashomero.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

	private UUID id;
	private String name;
	
	@Pattern(regexp = "\\S+", message =  "O campo [username] nao deve conter espaco")
	private String username;
	
	@Email(message =  "O campo [email] deve conter um email valido")
	private String email;
	
	@Length(min = 6, max = 10, message = "a senha deve ter entre (6) e (10) caracteres")
	private String password;
	private String description;
	private String curriculum;
	
}
