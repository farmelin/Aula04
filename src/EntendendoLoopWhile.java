import java.util.Scanner;

public class EntendendoLoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/

		int idade;
		double media=0;
		int quantidadeAluno = 0;
		
		Scanner leitor = new Scanner(System.in);
		while(quantidadeAluno < 5 ) {
			System.out.println("Informe a idade do "+ (quantidadeAluno+1)+ "º aluno");
			idade = leitor.nextInt();
			media = media + idade;
			// As três notações abaixo são similares
			quantidadeAluno = quantidadeAluno + 1;
			//quantidadeAluno += 1;
			//quantidadeAluno++;
			
		}
		
		media = media/5.0;

		System.out.println("A média da idade é " + media);
		
		leitor.close();

		
		
	}

}
