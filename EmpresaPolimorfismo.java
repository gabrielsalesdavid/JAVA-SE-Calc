package br.com.orientacaoaobjeto;

public class EmpresaPolimorfismo {
	public static void main(String[] args) {
		HerancaPessoaJuridicaPolimorfismo objEmpresa = new HerancaPessoaJuridicaPolimorfismo();
		objEmpresa.incluirPessoaJuridica("Gabriel Sales", "Rua Um", 1992, "São Paulo-SP", "(11) 98756-3654",
				"125.147.852.365-58 ", "Estudando Java ", "Melhoria ", "Rebeca Vitoria ");
		System.out.println("Nome: " + objEmpresa.retornaNome());
		System.out.println("Ramo Atividade: " + objEmpresa.retornaRamoAtividade());
		System.out.println("Gerente: " + objEmpresa.retornaGerente());
		System.out.println("Endereço: " + objEmpresa.retornaEndereco());
		System.out.println("Numero: " + objEmpresa.retornaNumero());
		System.out.println("Cidade: " + objEmpresa.retornaCidade());
		System.out.println("Telefone: " + objEmpresa.retornaTelefone());
		System.out.println("Cnpj: " + objEmpresa.retornaCnpj());
		System.out.println("Nome Fantasia: " + objEmpresa.retornaNomeFantasia());
	}
}
