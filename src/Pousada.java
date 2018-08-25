import java.util.Scanner;

public class Pousada {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		double valorCliente = 0;
		double lucroPousada = 0;
		
		System.out.println("Informe o nome do cliente:");
		String nome = leitor.nextLine();
		
		while (nome != "fim") {

			System.out.println("Informe a quantidade de dias que pretente ficar na pousada:");
			int dias = leitor.nextInt();
			
			if (dias >= 10) {
				valorCliente = (40 * dias) + (dias * 8);
				
			}else {
				valorCliente = (40 * dias) + (dias * 15);
				System.out.println("Cliente "+ nome + ", a sua conta está no valor de: R$"+ valorCliente);
				
			}
			lucroPousada = lucroPousada + valorCliente;
			System.out.println("Cliente "+ nome + ", a sua conta está no valor de: R$"+ valorCliente);
			
			System.out.println("Informe o nome do cliente:");
			nome = leitor.nextLine();

			
		}
		leitor.close();
	}

}
