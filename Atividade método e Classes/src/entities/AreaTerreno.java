package entities;

public class AreaTerreno {

	public double areaTotal;
	public double largura;
	public double comprimento;

	public void calculo(double largura, double comprimento) {

		areaTotal = largura * comprimento;

	}

}
