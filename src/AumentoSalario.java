import java.util.Scanner;

public class AumentoSalario {
	
	public static void main(String[] args) {
		
		double novoSalario;
		double aumento;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe o valor do sal�rio:");
		double salario = leitor.nextDouble();
		
		System.out.println("Qual o percentual do aumento:");
		double valorAumento = leitor.nextDouble();
		
		aumento = (salario * valorAumento ) / 100;
		novoSalario = salario + aumento;
		
		System.out.println("O aumento � de: R$" + aumento + " e o novo sal�rio �: R$" + novoSalario);
		
		leitor.close();
	}

}
