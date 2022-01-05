package prova;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Quiz quiz = new Quiz();
		Usuario usuario = new Usuario();
		int a = quiz.perguntas().length;
		int[] res = new int[a];
		int acertou = 0;
		int errou = 0;

		
		System.out.println("Digite o seu nome: ");
		usuario.setNome(entrada.nextLine());
		quiz.setUsuario(usuario);
		
		for(int i = 0; i < res.length; i++) {
			System.out.println(usuario.getNome() + ", " + quiz.perguntas()[i]);
			res[i] = entrada.nextInt();	
			if(quiz.resposta()[i] == res[i]) {
				acertou++;
			}else {
				errou++;
			}
			}
		
		System.out.println(usuario.getNome() + ", você acertou " + acertou + " questões e errou " + errou + " questões.");


	}
}
