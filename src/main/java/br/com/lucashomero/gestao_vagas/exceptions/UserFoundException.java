package br.com.lucashomero.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
	public UserFoundException() {
		super("Usuario ja existe");
	}
}
