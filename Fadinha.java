public class Fadinha {

	int saude;
	int energia;
	int forca;
	int felicidade;
	int magia;
	int comida;
	
	//Construtor da classe Fadinha
	//Os atributos da Fadinha iniciam com valor 10.
	public Fadinha() {
		this.saude = 10;
		this.energia = 10;
		this.forca = 10;
		this.felicidade = 10;
		this.magia = 10;
		this.comida = 10;
	}
	
	public void passarTurno() {
		System.out.println("Sua fadinha est� ficando velha!");
		//A classe GeradorDeNumeros � utilizada para gerar um n�mero aleat�rio
		//entre 0 e 2 para ser reduzido dos atributos da Fadinha
		this.saude -= GeradorDeNumeros.gerar();
		this.energia -= GeradorDeNumeros.gerar();
		this.forca -= GeradorDeNumeros.gerar();
		this.felicidade -= GeradorDeNumeros.gerar();
		this.magia -= GeradorDeNumeros.gerar();
		this.comida -= GeradorDeNumeros.gerar();
	}
	
	public void aplicarAcao(Acao acao) {
		//Ao aplicar uma A��o na Fadinha, seus atributos aumentam
		//de acordo com os atributos da a��o empregada
		this.saude += acao.getSaude();
		this.forca += acao.getForca();
		this.energia += acao.getEnergia();
		this.felicidade += acao.getFelicidade();
		this.magia += acao.getMagia();
		this.comida += acao.getComida();
	}
	
	public boolean estaVivo() {
		//Este m�todo retorna verdadeiro quando todos os atributos do
		//Fadinha forem maiores que zero. Caso um dos atributos seja
		//menor ou igual a zero este m�todo retorna falso.
		return (this.saude > 0 && this.energia > 0 && this.forca> 0 && this.felicidade>0 && this.magia>0 && this.comida>0);
	}
	
	public void status() {
		//Este m�todo imprime os valores dos atributos da Fadinha
		System.out.println("*******************");
		System.out.println("Dados da fadinha:");
		System.out.println("Sa�de -> " + this.saude);
		System.out.println("Energia -> " + this.energia);
		System.out.println("For�a -> " + this.forca);
		System.out.println("Felicidade -> " + this.felicidade);
		System.out.println("Magia -> " + this.magia);
		System.out.println("Comida -> " + this.comida);
		System.out.println("*******************");

	}
	
}