import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Fadinha fadinha = new Fadinha();
		EventoAleatorio eventoAleatorio	= new EventoAleatorio();
		int opcao, turno = 1;
		
		System.out.println("Sua Fadinha nasceu! \nCuide dela com carinho,\nnão deixe seus status chegarem a zero.");
		//Mostra o status da sua fadinha
		fadinha.status();

		//executa a repetição do jogo enquanto sua fadinha está viva
		while(fadinha.estaVivo()) {
			//Mostra as opções e espera o jogador digitar sua escolha
			System.out.println("\n\n### TURNO "+turno+" ###");
			System.out.println("Escolha uma ação: ");
			System.out.println("1- Comer: \n Energia++ \n Força++ \n Saúde++ \n Magia-- \n Felicidade \n \n" );
			System.out.println("2- Descansar: \n Energia+ \n Força-- \n Saúde++ \n Magia \n Felicidade+ \n \n");
			System.out.println("3- Malhação: \n Energia--- \n Força++ \n Saúde+++ \n Magia \n Felicidade++ \n \n");
			System.out.println("4- Treinar magia: \n Energia-- \n Força+ \n Saúde \n Magia+++ \n Felicidade+ \n \n");
			System.out.println("5- Brincar: \n Energia-- \n Saúde++ \n Magia \n Felicidade+ \n \n");
			System.out.println("6- Voar: \n Energia-- \n Saúde+ \n Magia+  \n Felicidade+ \n \n");
			System.out.println("7- Estudar: \n Energia-- \n Saúde++ \n Magia+ \n Felicidade+ \n \n");
			opcao = teclado.nextInt();

			switch(opcao) {

				//Caso o usuário digite 1 a opção é dar Comida a Fadinha:
				case 1:
					fadinha.aplicarAcao(new Comida());
					break;
				//Caso o usuário digite 2 a opção é fazer a fadinha descansar:
				case 2:
					fadinha.aplicarAcao(new Descansar());
					break;
				//Caso o usuário digite 3 a opção é fazer a fadinha Malhar:
				case 3:
					fadinha.aplicarAcao(new Malhacao());
					break;
				//Caso o usuário digite 4 a opção é fazer a fadinha Treinar magia:
				case 4:
					fadinha.aplicarAcao(new TreinarMagia());
					break;
				//Caso o usuário digite 4 a opção é fazer a fadinha Brincar:
				case 5:
					fadinha.aplicarAcao(new Brincar());
					break;
				//Caso o usuário digite 5 a opção é fazer a fadinha Voar:
				case 6:
					fadinha.aplicarAcao(new Voar());
					break;
				//Caso o usuário digite 6 a opção é fazer a fadinha Estudar:
				case 7:
					fadinha.aplicarAcao(new Estudar());
					break;
				default:
					System.out.println("Opção incorreta, digite uma opção válida.");
					break;
			}

			fadinha.status(); //Revela o status do fadinha

			// GeradorDeNumeros.rolarDado(); usar este método para rolar o dado
			fadinha.aplicarAcao(eventoAleatorio.getEventoAleatorio());

			//Executa a ação de passar turno onde o fadinha envelhece
			fadinha.passarTurno();

			//Revela o status do fadinha após passar turno
			fadinha.status();
			turno++;
		}		
		
		//Os status do fadinha chegaram a zero
		System.out.println("Sua fadinha morreu...");
		System.out.println("Ela sobreviveu "+ turno + " turnos.");

		teclado.close();
	}

}