package br.com.lucashomero.gestao_vagas.modules.candidate;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "candidate")
public class CandidateEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	private String name;
	
	@NotBlank
	@Pattern(regexp = "\\S+", message =  "O campo [username] nao deve conter espaco")
	private String username;
	
	@Email(message =  "O campo [email] deve conter um email valido")
	private String email;
	
	@Length(min = 6, max = 10, message = "a senha deve ter entre (6) e (10) caracteres")
	private String password;
	private String description;
	private String curriculum;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
}
