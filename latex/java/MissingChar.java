package Básico;
public class MissingChar {
	public static String missingChar(String str,int n) {
		String strx="";
		for(int i=0;i<str.length();i++) 
			if(i!=n) 				
				strx+=str.charAt(i);
		return strx;
	}
}
