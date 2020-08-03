package Avanzado;

public class TablasDeVerdad{
	
	public static boolean negacion(boolean a){
		if(!a) {
		return true;	
		}
		return false;
	 }
	public static boolean conjuncion(boolean a, boolean b){
		if(a && b) {
		return true;	
		}
		return false;
	 }
	public static boolean disyuncion(boolean a, boolean b){
		if(a || b) {
		return true;	
		}
		return false;
	 }
	public static boolean condicional(boolean a, boolean b){
		if(!a || b) {
		return true;	
		}
		return false;
	 }
	public static boolean bicondicional(boolean a, boolean b){
		if((a && b) || (!a && !b)) {
		return true;	
		}
		return false;
	 }
}

