package br.com.orientacaoaobjeto;

public class Aluno {
	public static void main(String[] args) {
		HerancaPessoaFisica objAluno = new HerancaPessoaFisica();
		objAluno.incluirPessoa("Bryan Gabriel", "Rua chato de mais", 2014, "São Paulo-SP", "(11) 97563-4444");
		objAluno.incluirPessoaFisica("45364789-1", "364.156.987-56", 5, 'M');
		System.out.println("Nome: " + objAluno.retornaNome());
		System.out.println("Sexo: " + objAluno.retornaSexo());
		System.out.println("Idade: " + objAluno.retornaIdade());
		System.out.println("Endereço: " + objAluno.retornaEndereco());
		System.out.println("Numero: " + objAluno.retornaNumero());
		System.out.println("Cidade: " + objAluno.retornaCidade());
		System.out.println("Telefone: " + objAluno.retornaTelefone());
		System.out.println("RG: " + objAluno.retornaRg());
		System.out.println("CPF: " + objAluno.retornaCpf());
	}
}
