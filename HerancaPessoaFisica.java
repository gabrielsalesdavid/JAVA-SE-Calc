package br.com.orientacaoaobjeto;

public class HerancaPessoaFisica extends HerancaPessoa {
	private String cpf;
	private String rg;
	private int idade;
	private char sexo;

	public void incluirPessoaFisica(String cpf, String rg, int idade, char sexo) {
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String retornaCpf() {
		return cpf;
	}

	public String retornaRg() {
		return rg;
	}

	public int retornaIdade() {
		return idade;
	}

	public char retornaSexo() {
		return sexo;
	}
}
