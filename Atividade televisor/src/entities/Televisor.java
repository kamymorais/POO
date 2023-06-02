package entities;

public class Televisor {

	public int canal = 1;
	public int volume = 0;
	public boolean ligada;

	public void aumentarCanal() {

		if (canal == canal && canal < 16) {
			canal += 1;
		}

	}

	public void diminuirCanal() {

		if (canal >= canal && canal > 0 ) {
			canal -= 1;
		}
	}

	public void aumentarVolume() {

		if (volume == volume && volume < 10) {
			volume += 1;

		}
	}

	public void diminuirVolume() {

		if (volume >= volume && volume >0) {
			volume -= 1;

		}

	}

	public void desligarTV() {

		if (ligada == true) {
			ligada = false;
		}
	}

	public void ligarTV() {
		if (ligada == false) {
			ligada = true;

		}
	}

	public void status() {
		if (ligada == true) {
			System.out.println("Sua TV está ligada  " + "\nCanal: " + canal + "\nVolume: " + volume);
		}
		else {
			System.out.println("Sua TV está desligada!! =( ");
		}

	}

}
