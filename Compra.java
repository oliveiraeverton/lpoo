import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Compra{

	private Funcionario funcionario;
	private Cliente cliente;
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public Compra(Funcionario funcionario, Cliente cliente) {
		//ArrayList<Produto> produtos = new ArrayList<>();
		this.funcionario = funcionario;
		this.cliente = cliente;
	}
	
	public void adicionaProduto(Produto prod) {
		//this.produtos = prod;
		this.produtos.add(prod);
		
	}
	
	
	
	//TODO
	/*O método listar compra deverá informar o Funcionário que fez a venda e o cliente que
	fez a compra. Em seguida, deverá listar todos os produtos comprados pelo cliente ordenado do menor
	para o maior valor do produto
	Ao final mostrar o valor total da compra.
	O valor do Produto impresso deve possuir 2 casas decimais
	*/
	public void listarCompra() {
		
		
		
		for (Produto produto : produtos) {
			System.out.println("" + produto);
		}
		//System.out.println("Fornecedor: "  );
		System.out.println("Funcionário: " + funcionario.getNome());
		System.out.println("Cliente: " + cliente.getNome());
		//System.out.println("Valor total: " + produto);
	}



	
}
