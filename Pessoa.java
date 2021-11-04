
import java.util.Scanner;

public abstract class Pessoa implements Verificavel {

	
	//atributos
	private String nome;
	private String cpf;
	private Endereco endereco;
	private String celular;
	
	//scanner
	Scanner input = new Scanner(System.in);
	//construtor
	public Pessoa(String nome, String cpf, Endereco endereco, String celular) {
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
		while(validar(cpf) != true) {
			System.out.println("CPF � inv�lido, digite um CPF v�lido: ");
			cpf = input.nextLine();
			validar(cpf);
		};
		
		this.cpf = cpf;
	}
	
	//metodos
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	//ASSINATURA DA INTERFACE VERIFICAVEL
	@Override
	public boolean validar(String cpf) {
        
		
		
		cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
		
        try{
            Long.parseLong(cpf);
        } 
        catch(NumberFormatException e){
        return false;
        }

        int d1, d2;
        int digito1, digito2, resto;
        int digitoCPF;
        String nDigResult;

        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;

        for (int nCount = 1; nCount < cpf.length() - 1; nCount++) {
        digitoCPF = Integer.valueOf(cpf.substring(nCount - 1, nCount)).intValue();

        // multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4
        // e assim por diante.
        d1 = d1 + (11 - nCount) * digitoCPF;

        // para o segundo digito repita o procedimento incluindo o primeiro
        // digito calculado no passo anterior.
        d2 = d2 + (12 - nCount) * digitoCPF;
        };

        // Primeiro resto da divis�o por 11.
        resto = (d1 % 11);

        // Se o resultado for 0 ou 1 o digito � 0 caso contr�rio o digito � 11
        // menos o resultado anterior.
        if (resto < 2)
        digito1 = 0;
        else
        digito1 = 11 - resto;

        d2 += 2 * digito1;

        // Segundo resto da divis�o por 11.
        resto = (d2 % 11);

        // Se o resultado for 0 ou 1 o digito � 0 caso contr�rio o digito � 11
        // menos o resultado anterior.
        if (resto < 2)
        digito2 = 0;
        else
        digito2 = 11 - resto;

        // Digito verificador do CPF que est� sendo validado.
        String nDigVerific = cpf.substring(cpf.length() - 2, cpf.length());

        // Concatenando o primeiro resto com o segundo.
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

        // comparar o digito verificador do cpf com o primeiro resto + o segundo
        // resto.
        return nDigVerific.equals(nDigResult);
	}



	@Override
	public void solicitarNovo() {
		

	}

}
