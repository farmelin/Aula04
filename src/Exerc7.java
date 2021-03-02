import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa javarella. Para isso devem acertar quantos feijões estão em um jarro (1238). Faça um programa que solicite a digitação da quantidade de feijões até que um cliente acerte.
		
		int feijoes, n = 0;
		String cliente; 
		Scanner leitor = new Scanner(System.in);
		
		while (n >0) {
			System.out.println("Informe o nome do cliente");
			cliente = leitor.next();
			System.out.println("Informe o número de feijões que existem no jarro:");
			feijoes = leitor.nextInt();
			n++ ;
			if (feijoes == 1238) {
				System.out.println("Parabéns "+ cliente + "!!! Você acertou !!!!!");
				n = -1;
			}
		}
	}

}
