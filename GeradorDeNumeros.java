import java.util.Random;

public class GeradorDeNumeros {

	public static int gerar() {
		Random r = new Random();
		return r.nextInt(5)/2;
	}

	public static int gerarEventoAleatorio() {
		Random r = new Random();
		return r.nextInt(9);
	}
	
	public static void main(String[] args) {
		System.out.println(GeradorDeNumeros.gerar());
	}
	
}
