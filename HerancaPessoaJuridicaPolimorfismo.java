package br.com.orientacaoaobjeto;

public class HerancaPessoaJuridicaPolimorfismo extends HerancaPessoa {
	private String cnpj;
	private String nomeFantasia;
	private String ramoAtividade;
	private String gerente;

	public void incluirPessoaJuridica(String nome, String endereco, int numero, String cidade, String telefone,
			String cnpj, String nomeFantasia, String ramoAtividade, String gerente) {
		super.incluirPessoa(nome, endereco, numero, cidade, telefone);
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
