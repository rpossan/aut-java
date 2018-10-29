package heranca;

public class PessoaTest {

	public static void main(String[] args) {
		// Inicie objetos conforme as classes criadas
		Pessoa p = new Pessoa();
		PessoaJuridica pj = new PessoaJuridica();
		PessoaFisica pf = new PessoaFisica();
		
		// Set o nome de cada pessoa
		p.setNome("Pessoa");
		pj.setNome("Ronaldo ME");
		pf.setNome("Ronaldo");
		
		// Imprima os nomes
		System.out.println(p.getNome());
		System.out.println(pj.getNome());
		System.out.println(pf.getNome());
		
		// Configure o CPF e CNPJ
		pj.setCnpj("123456");
		pf.setCpf("654321");
		
		// Imprima CPF e CNPJ
		System.out.println(pj.getCnpj());
		System.out.println(pf.getCpf());

	}

}
