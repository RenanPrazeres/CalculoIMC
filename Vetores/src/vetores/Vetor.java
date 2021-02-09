package vetores;

public class Vetor {

	public static void main(String[] args) {
		
		//*** criação de vetor/array
		
		
		double[] notas = {7.8, 8.4, 6.5, 9.2,};
		String[] aluno = {
				"maria",
				"Pedro",
				"Ana",
				"Fabiana", "Fernanda", "Willian"
		};
		System.out.println("Notas: " + notas.length);
		System.out.println("Alunos: " + aluno.length);
		System.out.println(" A nota do 3 Bimestre foi : " + notas[2]);
		System.out.println(" A nota do 4  Bimestre foi : " + notas[3]);
		notas[3] = 9.8;
		System.out.println(" A nota do 4  Bimestre foi : " + notas[3]);
		
		double media = (notas[0] + notas[1] + notas[2] + notas[3])/4;
		double soma = 0;
		System.out.println("Media: " + media);
		
		// Looping for/ while/ do-until
		
		for (int i = 0; i < 4; i++) {
			soma += notas[i];
		
			System.out.println("Média:" + media);
		}
		
		}

}
