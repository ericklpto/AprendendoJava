import java.util.Scanner;
public class Calc_Semestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float PROV1, PROJ1, LE1, CP1, PROV2, PROJ2, LE2, CP2, MBi1, MBi2, SM, PF;
		
		System.out.println("Digite a nota da 1ª Prova: ");
		PROV1 = sc.nextFloat();
		System.out.println("Digite a nota da 1ª Projeto: ");
		PROJ1 = sc.nextFloat();
		System.out.println("Digite a nota da 1ª Lista de Exercicios: ");
		LE1 = sc.nextFloat();
		System.out.println("Digite a nota da 1ª Contribuição de Projeto: ");
		CP1 = sc.nextFloat();
		System.out.println("Digite a nota da 2ª Prova: ");
		PROV2 = sc.nextFloat();
		System.out.println("Digite a nota da 2ª Projeto: ");
		PROJ2 = sc.nextFloat();
		System.out.println("Digite a nota da 2ª Lista de Exercicios: ");
		LE2 = sc.nextFloat();
		System.out.println("Digite a nota da 2ª Contribuição de Projeto: ");
		CP2 = sc.nextFloat();
		
		MBi1 = (PROV1 + PROJ1 + LE1 + CP1);
		MBi2 = (PROV2 + PROJ2 + LE2 + CP2);
		
		System.out.println("Media 1º Bimestre: "+ MBi1);
		System.out.println("Media 2º Bimestre: "+ MBi2);
		
		SM = ((MBi1 + MBi2)/ 2);
		
		if (SM >= 8.0) {
		System.out.println("Aprovado sua média é: "+ SM);
		} else {
			System.out.println("Reprovado");
			PF = (10 - SM);
			System.out.println("Nota minima para ser Aprovado é: "+ PF);
		}
	}
}
	
