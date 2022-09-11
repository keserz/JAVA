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
		lesCaracteres = new char[]{};
	}
	

	public String(char[] tab, int debut, int fin) {
//		Permet d’obtenir une chaîne de caractères à partir d’une partie du
//		tableau de caractères tab, commençant en d et finissant en f. Le
//		caractère d’indice f est exclu.
		
		lesCaracteres = new char[fin-debut];
		for (int i = 0; i<fin-debut; i++) {
			lesCaracteres[i] = tab[debut];
			debut++;
		}
		
	}
	
	public String(String s) {
//		Permet d’obtenir une chaîne à partir d’une autre chaîne (copie).
		lesCaracteres = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			lesCaracteres[i] = s.charAt(i);
		}
	}
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// METHODES ////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	public char charAt(int i) {
//		Retourne le caractère d’indice i.
		return this.lesCaracteres[i];
	}
	
	public int length() {
//		Retourne la longueur de la chaîne (nombre de caractères).
		return this.lesCaracteres.length;
	}
	
	public String substring(int debut, int fin) {
//		Retourne la sous-chaîne depuis d jusqu’à f exclu.
		return new String(lesCaracteres, debut, fin);
	}
	
	public String substring(int debut) {
//		Retourne la sous-chaîne depuis l’indice d jusqu’à la fin.
		return new String(lesCaracteres, debut, lesCaracteres.length);
	}
	

	
	public int compareTo(String s) {
//		Compare this à s. Renvoie une valeur négative, nulle ou
//		positive. La comparaison est une comparaison
//		lexicographique.
		return 2;
	}
	
	public boolean equals(Object obj) {
//		Compare la chaîne à un objet et retourne true en cas
//		d’égalité, false sinon.
		if (obj instanceof String) {
			//TODO faire la boucle qui compare chaque caracteres
		}
		
		return false;
	}
	
	public boolean startsWith(String prefixe) {
//		Renvoie true si et seulement si prefixe est un préfixe de
//		la chaîne.
		for (int i=0; i<prefixe.length(); i++ ) {
			if (lesCaracteres[i] != prefixe.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static String valueOf (boolean b) {
//		Retourne la représentation en chaîne du booléen b
		return new String();
	}

	public static String valueOf(char c) {
//		Retourne la représentation en chaîne du caractère c
		return new String();
	}

	public static String valueOf(int i) {
//		Retourne la représentation en chaîne de l’entier i.
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
