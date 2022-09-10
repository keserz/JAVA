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
//		Permet d’obtenir la chaîne vide
		this.lesCaracteres = "";
	}
	

	public String(char[] tab, int d, int f) {
//		Permet d’obtenir une chaîne de caractères à partir d’une partie du
//		tableau de caractères tab, commençant en d et finissant en f. Le
//		caractère d’indice f est exclu.
	}
	
	public String(String s) {
//		Permet d’obtenir une chaîne à partir d’une autre chaîne (copie).
	}
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// METHODES ////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	public char charAt(int i) {
//		Retourne le caractère d’indice i.
	}
	
	public int length() {
//		Retourne la longueur de la chaîne (nombre de caractères).
	}
	
	public String substring(int d, int f) {
//		Retourne la sous-chaîne depuis d jusqu’à f exclu.
	}
	
	public String substring(int d) {
//		Retourne la sous-chaîne depuis l’indice d jusqu’à la fin.
	}
	
	public int compareTo(String s) {
//		Compare this à s. Renvoie une valeur négative, nulle ou
//		positive. La comparaison est une comparaison
//		lexicographique.
	}
	
	public boolean equals(Object obj) {
//		Compare la chaîne à un objet et retourne true en cas
//		d’égalité, false sinon.
	}
	
	public boolean startsWith(String prefixe) {
//		Renvoie true si et seulement si prefixe est un préfixe de
//		la chaîne.
	}
	
	public static String valueOf (boolean b) {
//		Retourne la représentation en chaîne du booléen b
	}

	public static String valueOf(char c) {
//		Retourne la représentation en chaîne du caractère c
	}

	public static String valueOf(int i) {
//		Retourne la représentation en chaîne de l’entier i.
	}
	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////// MAIN //////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

	}

}
