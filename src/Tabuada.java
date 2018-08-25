import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro de 0 a 10:");
		int numero = leitor.nextInt();
		
		System.out.println("Informe 1 para soma, 2 para subtração, 3 para multiplicação ou 4 para divisão:");
		int tipo = leitor.nextInt();
		int i;
		
		if (tipo == 1) {
			for (i = 0; i<11; i++) {
				System.out.println(numero + " + " + i + " = " + (numero + i));
				
			}			
		}else if (tipo == 2) {
			for (i = 0; i<11; i++) {
				System.out.println(numero + " - " + i + " = " + (numero - i));			
			
			}
		}else if (tipo == 3) {
			for (i = 0; i<11; i++) {
				System.out.println(numero + " X " + i + " = " + (numero * i));			
				
			}		
		}else if (tipo == 4) {
			for (i = 0; i<11; i++) {
				System.out.println(numero + " / " + i + " = " + (numero / i));
				
			}
		}else {
			System.out.println("Informação inválida");
		}
		leitor.close();		
	}

}

