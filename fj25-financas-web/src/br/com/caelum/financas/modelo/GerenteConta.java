package br.com.caelum.financas.modelo;

import javax.persistence.Entity;

import org.hibernate.envers.Audited;

@Entity
@Audited
public class GerenteConta extends Gerente {
	
	private String numeroDaConta;

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

}
