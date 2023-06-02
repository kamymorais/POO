package entities;

public class Televisor {

	public int canal = 1;
	public int volume = 0;
	public String on = "desligada";

	public void aumentarCanal() {

		if (canal == canal && canal < 17) {
			canal += 1;
		}

	}

	public void diminuirCanal() {

		if (canal == canal && canal < 16) {
			canal -= 1;
		}
	}

	public void aumentarVolume() {

		if (volume == volume && volume < 11) {
			volume += 1;

		}
	}

	public void diminuirVolume() {

		if (volume == volume && volume < 11) {
			volume -= 1;

		}

	}

	public void desligarTV() {

		if (on == "ligada") {
			on = "desligada";
		}
	}

	public void ligarTV() {
		if (on == "desligada") {
			on = "ligada";

		}
	}

	public void status() {

		System.out.println("Sua TV está: " + on + " \nVocê está no canal: " + canal + "\nVolume: " + volume);

	}

}
