package entities;


public class AreaTriangulo {

	
	public double primeiraArea ;
	public double segundaArea;
	public double terceiraArea;
	public String tipoTriangulo ;
	
	public void calculo (double x, double y, double z) {
		
		 tipoTriangulo = "";
		
		if (x==y && y==z) {
			tipoTriangulo = "Tri�ngulo Equilateral";
		}
		else if (x==y || x == z || y == z) {
			tipoTriangulo = "Tri�ngulo Is�sceles";
		}
		else {
			tipoTriangulo = "Tri�ngulo escaleno";
		}
	}
}
