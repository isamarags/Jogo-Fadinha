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
		System.out.println("Sua fadinha está ficando velha!");
		//A classe GeradorDeNumeros é utilizada para gerar um número aleatório
		//entre 0 e 2 para ser reduzido dos atributos da Fadinha
		this.saude -= GeradorDeNumeros.gerar();
		this.energia -= GeradorDeNumeros.gerar();
		this.forca -= GeradorDeNumeros.gerar();
		this.felicidade -= GeradorDeNumeros.gerar();
		this.magia -= GeradorDeNumeros.gerar();
		this.comida -= GeradorDeNumeros.gerar();
	}
	
	public void aplicarAcao(Acao acao) {
		//Ao aplicar uma Ação na Fadinha, seus atributos aumentam
		//de acordo com os atributos da ação empregada
		this.saude += acao.getSaude();
		this.forca += acao.getForca();
		this.energia += acao.getEnergia();
		this.felicidade += acao.getFelicidade();
		this.magia += acao.getMagia();
		this.comida += acao.getComida();
	}
	
	public boolean estaVivo() {
		//Este método retorna verdadeiro quando todos os atributos do
		//Fadinha forem maiores que zero. Caso um dos atributos seja
		//menor ou igual a zero este método retorna falso.
		return (this.saude > 0 && this.energia > 0 && this.forca> 0 && this.felicidade>0 && this.magia>0 && this.comida>0);
	}
	
	public void status() {
		//Este método imprime os valores dos atributos da Fadinha
		System.out.println("*******************");
		System.out.println("Dados da fadinha:");
		System.out.println("Saúde -> " + this.saude);
		System.out.println("Energia -> " + this.energia);
		System.out.println("Força -> " + this.forca);
		System.out.println("Felicidade -> " + this.felicidade);
		System.out.println("Magia -> " + this.magia);
		System.out.println("Comida -> " + this.comida);
		System.out.println("*******************");

	}
	
}