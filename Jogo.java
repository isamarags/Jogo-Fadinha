import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Fadinha fadinha = new Fadinha();
		EventoAleatorio eventoAleatorio	= new EventoAleatorio();
		int opcao, turno = 1;
		
		System.out.println("Sua Fadinha nasceu! \nCuide dela com carinho,\nn�o deixe seus status chegarem a zero.");
		//Mostra o status da sua fadinha
		fadinha.status();

		//executa a repeti��o do jogo enquanto sua fadinha est� viva
		while(fadinha.estaVivo()) {
			//Mostra as op��es e espera o jogador digitar sua escolha
			System.out.println("\n\n### TURNO "+turno+" ###");
			System.out.println("Escolha uma a��o: ");
			System.out.println("1- Comer: \n Energia++ \n For�a++ \n Sa�de++ \n Magia-- \n Felicidade \n \n" );
			System.out.println("2- Descansar: \n Energia+ \n For�a-- \n Sa�de++ \n Magia \n Felicidade+ \n \n");
			System.out.println("3- Malha��o: \n Energia--- \n For�a++ \n Sa�de+++ \n Magia \n Felicidade++ \n \n");
			System.out.println("4- Treinar magia: \n Energia-- \n For�a+ \n Sa�de \n Magia+++ \n Felicidade+ \n \n");
			System.out.println("5- Brincar: \n Energia-- \n Sa�de++ \n Magia \n Felicidade+ \n \n");
			System.out.println("6- Voar: \n Energia-- \n Sa�de+ \n Magia+  \n Felicidade+ \n \n");
			System.out.println("7- Estudar: \n Energia-- \n Sa�de++ \n Magia+ \n Felicidade+ \n \n");
			opcao = teclado.nextInt();

			switch(opcao) {

				//Caso o usu�rio digite 1 a op��o � dar Comida a Fadinha:
				case 1:
					fadinha.aplicarAcao(new Comida());
					break;
				//Caso o usu�rio digite 2 a op��o � fazer a fadinha descansar:
				case 2:
					fadinha.aplicarAcao(new Descansar());
					break;
				//Caso o usu�rio digite 3 a op��o � fazer a fadinha Malhar:
				case 3:
					fadinha.aplicarAcao(new Malhacao());
					break;
				//Caso o usu�rio digite 4 a op��o � fazer a fadinha Treinar magia:
				case 4:
					fadinha.aplicarAcao(new TreinarMagia());
					break;
				//Caso o usu�rio digite 4 a op��o � fazer a fadinha Brincar:
				case 5:
					fadinha.aplicarAcao(new Brincar());
					break;
				//Caso o usu�rio digite 5 a op��o � fazer a fadinha Voar:
				case 6:
					fadinha.aplicarAcao(new Voar());
					break;
				//Caso o usu�rio digite 6 a op��o � fazer a fadinha Estudar:
				case 7:
					fadinha.aplicarAcao(new Estudar());
					break;
				default:
					System.out.println("Op��o incorreta, digite uma op��o v�lida.");
					break;
			}

			fadinha.status(); //Revela o status do fadinha

			// GeradorDeNumeros.rolarDado(); usar este m�todo para rolar o dado
			fadinha.aplicarAcao(eventoAleatorio.getEventoAleatorio());

			//Executa a a��o de passar turno onde o fadinha envelhece
			fadinha.passarTurno();

			//Revela o status do fadinha ap�s passar turno
			fadinha.status();
			turno++;
		}		
		
		//Os status do fadinha chegaram a zero
		System.out.println("Sua fadinha morreu...");
		System.out.println("Ela sobreviveu "+ turno + " turnos.");

		teclado.close();
	}

}