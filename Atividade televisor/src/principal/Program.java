package principal;

import entities.Televisor;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televisor modo = new Televisor ();
		
		modo.ligarTV();
		modo.aumentarCanal();
		modo.aumentarVolume();
		
		
		modo.desligarTV();
		modo.diminuirCanal();
		modo.diminuirVolume();
		modo.status();
       
      
        
			}

}

