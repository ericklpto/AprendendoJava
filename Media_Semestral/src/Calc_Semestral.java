import java.util.Scanner;
public class Calc_Semestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float PROV1, PROJ1, LE1, CP1, PROV2, PROJ2, LE2, CP2, MBi1, MBi2, SM, PF;
		
		System.out.println("Digite a nota da 1� Prova: ");
		PROV1 = sc.nextFloat();
		System.out.println("Digite a nota da 1� Projeto: ");
		PROJ1 = sc.nextFloat();
		System.out.println("Digite a nota da 1� Lista de Exercicios: ");
		LE1 = sc.nextFloat();
		System.out.println("Digite a nota da 1� Contribui��o de Projeto: ");
		CP1 = sc.nextFloat();
		System.out.println("Digite a nota da 2� Prova: ");
		PROV2 = sc.nextFloat();
		System.out.println("Digite a nota da 2� Projeto: ");
		PROJ2 = sc.nextFloat();
		System.out.println("Digite a nota da 2� Lista de Exercicios: ");
		LE2 = sc.nextFloat();
		System.out.println("Digite a nota da 2� Contribui��o de Projeto: ");
		CP2 = sc.nextFloat();
		
		MBi1 = (PROV1 + PROJ1 + LE1 + CP1);
		MBi2 = (PROV2 + PROJ2 + LE2 + CP2);
		
		System.out.println("Media 1� Bimestre: "+ MBi1);
		System.out.println("Media 2� Bimestre: "+ MBi2);
		
		SM = ((MBi1 + MBi2)/ 2);
		
		if (SM >= 8.0) {
		System.out.println("Aprovado sua m�dia �: "+ SM);
		} else {
			System.out.println("Reprovado");
			PF = (10 - SM);
			System.out.println("Nota minima para ser Aprovado �: "+ PF);
		}
	}
}
	
