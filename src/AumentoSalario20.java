import java.util.Scanner;

public class AumentoSalario20 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe o nome do funcionário:");
		String nome = leitor.nextLine();
		
		while (nome != "fim") {
			
			
			System.out.println("Informe o salário:");
			double salario = leitor.nextDouble();
			
			if (salario >= 500.00) {
				System.out.println("O funcionário(a): " + nome + " não tem direito ao aumento.");
							
			}else {
				double novoSalario;
				double aumento;
				aumento = (salario * 20) / 100;
				novoSalario = salario + aumento;				
				System.out.println("O salário reajustado de: "  + nome + " está no valor de R$" + novoSalario);
			}
			System.out.println("Informe o nome do funcionário:");
			nome = leitor.nextLine();
			
		}
		
		leitor.close();
	}

}
