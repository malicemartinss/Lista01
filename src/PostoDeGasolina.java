import java.util.Scanner;

public class PostoDeGasolina {
	
	public static void main(String[] args) {
		
		double valorLitro;
		double valorCompra;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de litros de gasolina:");
		double litroGasolina = leitor.nextDouble();
		
		valorLitro = litroGasolina * 2.50;
		valorCompra = valorLitro + 6.00;
		
		System.out.println("O valor total da compra foi: R$" + valorCompra);
		
		leitor.close();	
	}

}
