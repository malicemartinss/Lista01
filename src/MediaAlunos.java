import java.util.Scanner;

public class MediaAlunos {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int i;
		int totalApr = 0;
		int totalExa = 0;
		int totalRep = 0;

		double media;
		double mediaClasse = 0;
		
		for(i=0; i<6; i++) {
			System.out.println("Informe a primeira nota:");
			double notaUm = leitor.nextDouble();
			
			System.out.println("Informe a segunda nota:");
			double notaDois = leitor.nextDouble();
			
			media = (notaUm + notaDois)/2;
			System.out.println("A média é:" + media);
			
			mediaClasse = (mediaClasse + media)/6;
			
			if (media < 3.0) {
				System.out.println("Reprovado");
				totalRep = totalRep + 1;
			}else if(media >= 3.0 && media <= 7.0){
				System.out.println("Exame");
				totalExa = totalExa + 1;
			}else {
				System.out.println("Aprovado");
				totalApr = totalApr + 1;
			}
			
		}
		System.out.println("O total de alunos aprovados é: " + totalApr);
		System.out.println("O total de alunos reprovados é: " + totalRep);
		System.out.println("O total de alunos de exame é: " + totalExa);
		System.out.println("A média da classe é: " + mediaClasse);
		
		leitor.close();
	}

}
