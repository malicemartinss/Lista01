import java.util.Scanner;

public class Emprestimo {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		double calculo;
		
		System.out.println("Informe o sal�rio bruto:");
		double salario = leitor.nextDouble();
		
		System.out.println("Informe o valor da presta��o:");
		double prestacao = leitor.nextDouble();
		
		calculo = (salario * 30)/100;
		if (prestacao > calculo) {
			System.out.println("Emprestimo n�o concedido.");
		}else {
			System.out.println("O emprestimo foi concedido, parab�ns!!");
		}
		
		leitor.close();
	}

}
