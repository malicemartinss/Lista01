import java.util.Scanner;

public class ImparPar {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int i;
		
		for (i=0; i<10;i++) {
			
			System.out.println("Informe um n�mero:");
			int numero = leitor.nextInt();
			if (numero % 2 == 0) {
				System.out.println("O n�mero " + numero + " � par!");
			}
			else {
				System.out.println("O n�mero " +  numero + " � �mpar!");
			}
			
		}
		
		
		leitor.close();
	}

}
