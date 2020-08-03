package Avanzado;

public class ADN {
	public static boolean valido(String adn) {
		int contador=0;
		boolean valido;
		do {
			switch (adn.charAt(contador)) {
			case 'A':	
				valido=true;
		 	    break;
			case 'C':
				valido=true;
			    break;
			case 'G': 	
				valido=true;
 	            break;
			case 'T': 	
				valido=true;
			    break;
			default: 	
				valido=false;
				break;   
			}
			contador++;
		}
		while(contador<adn.length()&valido==true);
		return valido;
	}
	public static String mutarAmp(String adn, int a, int b) {
		if(valido(adn)) {
			String adnx;
			adnx=adn.substring(0,b)+adn.substring(a);
			return adnx;
		}
		else return "Cadena no válida";
	}
	public static String mutarDel(String adn, int a, int b) {
		if(valido(adn)) {
			String adnx;
			adnx=adn.substring(0,a)+adn.substring(b);
			return adnx;
		}
		else return "Cadena no válida";
	}
	public static String mutarInv(String adn, int a, int b) {
		if(valido(adn)) {
			String adnx="";
			int i;
			for(i=0;i<a;i++) {
				adnx=adnx+adn.charAt(i);
			}
			for(i=b-1;i>=a;i--) {
				adnx=adnx+adn.charAt(i);
			}
			for(i=b;i<adn.length();i++) {
				adnx=adnx+adn.charAt(i);
			}
			return adnx;
		}
		else return "Cadena no válida";
	}
}
