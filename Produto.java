public class Produto {
	
	private String nomeProduto; 
	private Float valor; 
	private Fornecedor fornecedor;
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Produto(String nomeProduto, Float valor, Fornecedor fornecedor) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}
	
	//compara os produtos pelo valor - TODO
	//perguntar para a teacher
	//DUVIDA
	//COMO VAI COMPARAR DOIS OBJETOS
	//
	//SE VAMOS PASSAR SOMENTE UM OBJETO
	//TA PASSADA????
	//......
	 public int compareTo(Object obj) {
		 if (this.valor > outroAluno.getPontos()) { 
			  return -1; 
			  } if (this.valor < .getPontos()) { 
			  return 1; 
			  } 
			  return 0; 
			 }
	 }
	 

	 
	 //DUVIDA 
	 //
	 //
	 //
	 //
	@Override
	public String toString() {
		return "Produto = " + nomeProduto + "\nValor = " + valor + "\nFornecedor = " + fornecedor.getNomeFantasia() + "\n";
	}
	//
	//
	//
	//

	
}
