import java.util.Scanner;

import java.util.InputMismatchException;
public class Fornecedor implements Verificavel{
	
	//atributos
	
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	
	
	
	//metodos
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	private Endereco endereco;
	private String celular;
	
	Scanner input = new Scanner(System.in);
	
	//construtor
	public Fornecedor(String razaoSocial, String nomeFant, String cnpj, Endereco endereco, String celular) {
		
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFant;
		this.endereco = endereco;
		this.celular = celular;
		
		while(validar(cnpj) != true) {
			System.out.println("CNPJ � inv�lido, digite um CNPJ v�lido: ");
			cnpj = input.nextLine();
			validar(cnpj);
		};
		
		this.cnpj = cnpj;
	}
	
	//m�todos
	
	@Override
		public boolean validar(String cnpj) {
	        cnpj = cnpj.replace(".", "");
	        cnpj = cnpj.replace("-", "");
	        cnpj = cnpj.replace("/", "");

	        try{
	            Long.parseLong(cnpj);
	        } 
	        catch(NumberFormatException e){
	        return false;
	        }
	            
	            // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
	            if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111")
	                || cnpj.equals("22222222222222") || cnpj.equals("33333333333333")
	                || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
	                || cnpj.equals("66666666666666") || cnpj.equals("77777777777777")
	                || cnpj.equals("88888888888888") || cnpj.equals("99999999999999") || (cnpj.length() != 14))
	            return (false);
	            char dig13, dig14;
	            int sm, i, r, num, peso; 
	            // "try" - protege o c�digo para eventuais
	            // erros de conversao de tipo (int)
	            try {
	            // Calculo do 1o. Digito Verificador
	            sm = 0;
	            peso = 2;
	            for (i = 11; i >= 0; i--) {
	                // converte o i-�simo caractere do CNPJ em um n�mero: // por
	                // exemplo, transforma o caractere '0' no inteiro 0 // (48 eh a
	                // posi��o de '0' na tabela ASCII)
	                num = (int) (cnpj.charAt(i) - 48);
	                sm = sm + (num * peso);
	                peso = peso + 1;
	                if (peso == 10)
	                peso = 2;
	            }

	            r = sm % 11;
	            if ((r == 0) || (r == 1))
	                dig13 = '0';
	            else
	                dig13 = (char) ((11 - r) + 48);

	            // Calculo do 2o. Digito Verificador
	            sm = 0;
	            peso = 2;
	            for (i = 12; i >= 0; i--) {
	                num = (int) (cnpj.charAt(i) - 48);
	                sm = sm + (num * peso);
	                peso = peso + 1;
	                if (peso == 10)
	                peso = 2;
	            }
	            r = sm % 11;
	            if ((r == 0) || (r == 1))
	                dig14 = '0';
	            else
	                dig14 = (char) ((11 - r) + 48);
	            // Verifica se os d�gitos calculados conferem com os d�gitos
	            // informados.
	            if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13)))
	                return (true);
	            else
	                return (false);
	            }catch (InputMismatchException erro) {
	            return (false);
	            }
		}

	@Override
	public void solicitarNovo() {
	
		
	}
	
}
