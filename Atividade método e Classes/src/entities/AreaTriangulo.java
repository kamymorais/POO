package entities;


public class AreaTriangulo {

	
	public double primeiraArea ;
	public double segundaArea;
	public double terceiraArea;
	public String tipoTriangulo ;
	
	public void calculo (double x, double y, double z) {
		
		 tipoTriangulo = "";
		
		if (x==y && y==z) {
			tipoTriangulo = "Triângulo Equilateral";
		}
		else if (x==y || x == z || y == z) {
			tipoTriangulo = "Triângulo Isósceles";
		}
		else {
			tipoTriangulo = "Triângulo escaleno";
		}
	}
}
