package String_StringBuffer;

public class String extends Object{
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// ATTRIBUTS ///////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	private char[] lesCaracteres;

	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////// CONSTRUCTEURS /////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	
	public String() {
		// TODO Auto-generated constructor stub
//		Permet d�obtenir la cha�ne vide
		this.lesCaracteres = "";
	}
	

	public String(char[] tab, int d, int f) {
//		Permet d�obtenir une cha�ne de caract�res � partir d�une partie du
//		tableau de caract�res tab, commen�ant en d et finissant en f. Le
//		caract�re d�indice f est exclu.
	}
	
	public String(String s) {
//		Permet d�obtenir une cha�ne � partir d�une autre cha�ne (copie).
	}
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// METHODES ////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	public char charAt(int i) {
//		Retourne le caract�re d�indice i.
	}
	
	public int length() {
//		Retourne la longueur de la cha�ne (nombre de caract�res).
	}
	
	public String substring(int d, int f) {
//		Retourne la sous-cha�ne depuis d jusqu�� f exclu.
	}
	
	public String substring(int d) {
//		Retourne la sous-cha�ne depuis l�indice d jusqu�� la fin.
	}
	
	public int compareTo(String s) {
//		Compare this � s. Renvoie une valeur n�gative, nulle ou
//		positive. La comparaison est une comparaison
//		lexicographique.
	}
	
	public boolean equals(Object obj) {
//		Compare la cha�ne � un objet et retourne true en cas
//		d��galit�, false sinon.
	}
	
	public boolean startsWith(String prefixe) {
//		Renvoie true si et seulement si prefixe est un pr�fixe de
//		la cha�ne.
	}
	
	public static String valueOf (boolean b) {
//		Retourne la repr�sentation en cha�ne du bool�en b
	}

	public static String valueOf(char c) {
//		Retourne la repr�sentation en cha�ne du caract�re c
	}

	public static String valueOf(int i) {
//		Retourne la repr�sentation en cha�ne de l�entier i.
	}
	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////// MAIN //////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

	}

}
