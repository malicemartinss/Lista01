import java.util.Scanner;

public class AumentoSalario20 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe o nome do funcion�rio:");
		String nome = leitor.nextLine();
		
		while (nome != "fim") {
			
			
			System.out.println("Informe o sal�rio:");
			double salario = leitor.nextDouble();
			
			if (salario >= 500.00) {
				System.out.println("O funcion�rio(a): " + nome + " n�o tem direito ao aumento.");
							
			}else {
				double novoSalario;
				double aumento;
				aumento = (salario * 20) / 100;
				novoSalario = salario + aumento;				
				System.out.println("O sal�rio reajustado de: "  + nome + " est� no valor de R$" + novoSalario);
			}
			System.out.println("Informe o nome do funcion�rio:");
			nome = leitor.nextLine();
			
		}
		
		leitor.close();
	}

}
