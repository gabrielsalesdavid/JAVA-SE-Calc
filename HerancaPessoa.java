package br.com.orientacaoaobjeto;

public class HerancaPessoa {
	private String nome;
	private String endereco;
	private int numero;
	private String cidade;
	private String telefone;

	public void incluirPessoa(String nome, String endereco, int numero, String cidade, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.telefone = telefone;
	}

	public String retornaNome() {
		return nome;
	}

	public String retornaEndereco() {
		return endereco;
	}

	public int retornaNumero() {
		return numero;
	}

	public String retornaCidade() {
		return cidade;
	}

	public String retornaTelefone() {
		return telefone;
	}
}
