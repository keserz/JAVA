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
		lesCaracteres = new char[]{};
	}
	

	public String(char[] tab, int debut, int fin) {
//		Permet d�obtenir une cha�ne de caract�res � partir d�une partie du
//		tableau de caract�res tab, commen�ant en d et finissant en f. Le
//		caract�re d�indice f est exclu.
		
		lesCaracteres = new char[fin-debut];
		for (int i = 0; i<fin-debut; i++) {
			lesCaracteres[i] = tab[debut];
			debut++;
		}
		
	}
	
	public String(String s) {
//		Permet d�obtenir une cha�ne � partir d�une autre cha�ne (copie).
		lesCaracteres = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			lesCaracteres[i] = s.charAt(i);
		}
	}
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// METHODES ////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	public char charAt(int i) {
//		Retourne le caract�re d�indice i.
		return this.lesCaracteres[i];
	}
	
	public int length() {
//		Retourne la longueur de la cha�ne (nombre de caract�res).
		return this.lesCaracteres.length;
	}
	
	public String substring(int debut, int fin) {
//		Retourne la sous-cha�ne depuis d jusqu�� f exclu.
		return new String(lesCaracteres, debut, fin);
	}
	
	public String substring(int debut) {
//		Retourne la sous-cha�ne depuis l�indice d jusqu�� la fin.
		return new String(lesCaracteres, debut, lesCaracteres.length);
	}
	

	
	public int compareTo(String s) {
//		Compare this � s. Renvoie une valeur n�gative, nulle ou
//		positive. La comparaison est une comparaison
//		lexicographique.
		return 2;
	}
	
	public boolean equals(Object obj) {
//		Compare la cha�ne � un objet et retourne true en cas
//		d��galit�, false sinon.
		if (obj instanceof String) {
			//TODO faire la boucle qui compare chaque caracteres
		}
		
		return false;
	}
	
	public boolean startsWith(String prefixe) {
//		Renvoie true si et seulement si prefixe est un pr�fixe de
//		la cha�ne.
		for (int i=0; i<prefixe.length(); i++ ) {
			if (lesCaracteres[i] != prefixe.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static String valueOf (boolean b) {
//		Retourne la repr�sentation en cha�ne du bool�en b
		return new String();
	}

	public static String valueOf(char c) {
//		Retourne la repr�sentation en cha�ne du caract�re c
		return new String();
	}

	public static String valueOf(int i) {
//		Retourne la repr�sentation en cha�ne de l�entier i.
		return new String();
		//bonjour
	}
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////// MAIN //////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

	}

}
