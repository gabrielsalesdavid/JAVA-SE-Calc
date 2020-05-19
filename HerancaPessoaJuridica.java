package br.com.orientacaoaobjeto;

public class HerancaPessoaJuridica extends HerancaPessoa {
	private String cnpj;
	private String nomeFantasia;
	private String ramoAtividade;
	private String gerente;

	public void incluirPessoaJuridica(String cnpj, String nomeFantasia, String ramoAtividade, String gerente) {
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.ramoAtividade = ramoAtividade;
		this.gerente = gerente;
	}

	public String retornaCnpj() {
		return cnpj;
	}

	public String retornaNomeFantasia() {
		return nomeFantasia;
	}

	public String retornaRamoAtividade() {
		return ramoAtividade;
	}

	public String retornaGerente() {
		return gerente;
	}
}
