package entities;


public class AreaTriangulo {

	
	public double x ;
	public double y;
	public double z;
	public String tipoTriangulo ;
	
	public String resultado () {
		
		
		String tipoTriangulo = "";
		
		if (x==y && y==z) {
			tipoTriangulo = "Tri�ngulo equil�tero";
		}
		else if (x==y || x == z || y == z) {
			tipoTriangulo = "Tri�ngulo is�sceles";
		}
		else {
			tipoTriangulo = "Tri�ngulo escaleno";
		
		}
		
		return "O tipo de tri�ngulo �: " + tipoTriangulo; 
	}
}
