package entities;

public class AreaTriangulo {

	public double x;
	public double y;
	public double z;
	public String tipoTriangulo;

	public String resultado() {

		String tipoTriangulo = "";

		if (x == y && y == z) {
			tipoTriangulo = "Triângulo equilátero";
			return "O tipo de triângulo é: " + tipoTriangulo;
		} else if (x == y || x == z || y == z) {
			tipoTriangulo = "Triângulo isósceles";
			return "O tipo de triângulo é: " + tipoTriangulo;
		} else {
			tipoTriangulo = "Triângulo escaleno";
			return "O tipo de triângulo é: " + tipoTriangulo;

		}

	
	}
}
