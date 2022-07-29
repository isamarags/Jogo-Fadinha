public class EventoAleatorio extends Acao {

	int energia;
	int forca;
	int saude;
	int felicidade;
	int magia;
	int comida;

	public EventoAleatorio() {
		energia = 0;
		forca = 0;
		saude = 0;
		felicidade = 0;
		magia = 0;
		comida = 0;
	}

	public int getEnergia() {
		return energia;
	}

	public int getForca() {
		return forca;
	}

	public int getSaude() {
		return saude;
	}

	public int getFelicidade() {
		return felicidade;
	}

	public int getMagia() {
		return magia;
	}

	public int getComida() {
		return comida;
	}

	public Acao getEventoAleatorio() {

			switch(GeradorDeNumeros.gerarEventoAleatorio()) {

				case 1:
					return new CriancaIncredula();

				case 2:
					return new BebeuCafe();

				case 3:
					return new BrigouComFadas();

				case 4:
					return new EncontrouPoMagico();

				case 5:
					return new FicouDoente();

				case 6:
					return new ConvidadaAFesta();

				case 7:
					return new RaptadaPelosPiratas();

				case 8:
					return new NaoFezNada();

				case 9:
					return new SalvouCrianca();

				default:
					return new SorteDoDia();
			}
		}

	}