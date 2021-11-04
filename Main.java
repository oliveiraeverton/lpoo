import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		String nome, cpf, funcao, razaoSocial, nomeFantasia, cnpj, celular, rua, bairro, cidade, cep, nomeProduto;
//		Produto prod;
//		int numero;
//		float salario, valor;
		
		Scanner sc=new Scanner(System.in);
		 
//		Endereco endereco = new Endereco(rua, numero, bairro, cidade, cep);
//		Funcionario funcionario = new Funcionario(nome, cpf, endereco, celular, salario, funcao);
//		Cliente cliente = new Cliente(nome, cpf, endereco, celular);
//		Fornecedor fornecedor = new Fornecedor(razaoSocial, nomeFantasia, cnpj, endereco, celular);
//		Produto produto = new Produto(nomeProduto, valor, fornecedor);
//		Compra compra = new Compra(funcionario, cliente);
		
		Endereco end1 = new Endereco("Av. Costa e Silva", 2001, "Universitário", "Campo Grande", "79070-900");
        Endereco end2 = new Endereco("Av. Afonso Pena", 2002, "Centro", "Campo Grande", "79065-555");
        Endereco end3 = new Endereco("Rua do Parque", 2003, "Centro", "Campo Grande", "79065-190");
        Endereco end4 = new Endereco("Av. Nelly Martins", 2004, "Portal Itayara", "Campo Grande", "79065-190");
        Endereco end5 = new Endereco("Rua Coronel Zózimo", 2005, "Monte Castelo", "Campo Grande", "79065-190");
        Endereco end6 = new Endereco("Rua Barueri", 2006, "Moreninha II", "Campo Grande", "79065-190");

        Funcionario func1 = new Funcionario("Everton", "04653302154", end1, "67999464219",  1000, "Feirante");
        Funcionario func2 = new Funcionario("Lourdes", "22222222222", end2, "67999898985", 1000, "Feirante");
        
        //String nome, String cpf, Endereco endereco, String celular
        Cliente cli1 = new Cliente("Eduardo", "07435925144", end3, "67999464221");
        Cliente cli2 = new Cliente("Thiago", "50093037104", end4, "67999464220");
        
		Fornecedor empresa1 = new Fornecedor("barraca no mercadão municipal", "GOOOL", "52393813000192", end5, "67999464219");
		Fornecedor empresa2 = new Fornecedor("barraca na feira central", "TAAAM", "52393813000192", end5, "67999464219");
		
		Produto produto1 = new Produto("Morango", 1.50f, empresa1);
		Produto produto2 = new Produto("Macadâmia", 2.50f, empresa1);
		Produto produto3 = new Produto("Manga", 3.50f, empresa1);
		Produto produto4 = new Produto("Mexerica", 4.50f, empresa1);
		Produto produto5 = new Produto("Mamão", 5.50f, empresa2);
		Produto produto6 = new Produto("Mirtilo", 6.50f, empresa2);
		Produto produto7 = new Produto("Melancia", 7.50f, empresa2);
		Produto produto8 = new Produto("Melão", 8.50f, empresa2);
		Produto produto9 = new Produto("Maça", 9.50f, empresa1);
		Produto produto10 = new Produto("Maracujá", 10.50f, empresa1);
		
		Compra compra1 = new Compra(func1, cli1);
		Compra compra2 = new Compra(func2, cli2);
		
		//compra1.produtos.add(produto1);
		compra1.adicionaProduto(produto1);
		compra1.adicionaProduto(produto2);
		compra1.adicionaProduto(produto3);
		compra1.adicionaProduto(produto4);
		compra1.adicionaProduto(produto5);
		
		compra2.adicionaProduto(produto6);
		compra2.adicionaProduto(produto7);
		compra2.adicionaProduto(produto8);
		compra2.adicionaProduto(produto9);
		compra2.adicionaProduto(produto10);
		
		compra2.listarCompra();
		
		
		// Usar exceção para tratar entradas inválidas para os valores referente a produtos e salário do Funcionario - TODO
		
		

	}

}
