package String_StringBuffer;

public class String extends Object{
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// ATTRIBUTS ///////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	private char[] lesCaracteres;
	private static  final char[] CHAINE_TRUE = new String(new char[]{'t','r','u','e'},0,4);
	private static  final char[] CHAINE_FALSE = new String(new char[] {'f','a','l','s','e'},0,5);
	private static  final char[] TAB_VIDE=new char[0];

	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////// CONSTRUCTEURS /////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	public String() {
<<<<<<< HEAD
		// TODO Auto-generated constructor stub
//		Permet dï¿½obtenir la chaï¿½ne vide
=======
		// TODO A finir
//		Permet d’obtenir la chaîne vide
>>>>>>> branch 'master' of https://github.com/keserz/JAVA
		lesCaracteres = new char[]{};
	}
	

	public String(char[] tab, int debut, int fin) {
//		Permet dï¿½obtenir une chaï¿½ne de caractï¿½res ï¿½ partir dï¿½une partie du
//		tableau de caractï¿½res tab, commenï¿½ant en d et finissant en f. Le
//		caractï¿½re dï¿½indice f est exclu.
		
		lesCaracteres = new char[fin-debut];
		int j = debut;
		for (int i = 0; i<fin-debut; i++) {
			lesCaracteres[i] = tab[debut];
			j++;
		}
		
	}
	
	public String(String s) {
//		Permet dï¿½obtenir une chaï¿½ne ï¿½ partir dï¿½une autre chaï¿½ne (copie).
//		lesCaracteres = new char[s.length()];
//		for (int i = 0; i < s.length(); i++) {
//			lesCaracteres[i] = s.charAt(i);
		
		lesCaracteres = s.lesCaracteres;
		}
	
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// METHODES ////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	public char charAt(int i) {
//		Retourne le caractï¿½re dï¿½indice i.
		if ((i<0) || (i >= lesCaracteres.length)){
			throw new StringIndexOutOfBoundsException(i);
		}
		return this.lesCaracteres[i];
	}
	
	public int length() {
//		Retourne la longueur de la chaï¿½ne (nombre de caractï¿½res).
		return lesCaracteres.length;
	}
	
	public String substring(int debut, int fin) {
//		Retourne la sous-chaï¿½ne depuis d jusquï¿½ï¿½ f exclu.
		return new String(lesCaracteres, debut, fin);
	}
	
	public String substring(int debut) {
//		Retourne la sous-chaï¿½ne depuis lï¿½indice d jusquï¿½ï¿½ la fin.
		return new String(lesCaracteres, debut, lesCaracteres.length);
	}
	

	
	public int compareTo(String s) {
//		Compare this ï¿½ s. Renvoie une valeur nï¿½gative, nulle ou
//		positive. La comparaison est une comparaison
//		lexicographique.
<<<<<<< HEAD
		int lMin = length() < s.length()?length(): s.length();
			
=======
		// TODO A finir
		return 2;
>>>>>>> branch 'master' of https://github.com/keserz/JAVA
	}
	
	public boolean equals(Object obj) {
//		Compare la chaï¿½ne ï¿½ un objet et retourne true en cas
//		dï¿½ï¿½galitï¿½, false sinon.
		if (obj instanceof String) {
			//TODO faire la boucle qui compare chaque caracteres
		}
		
		return false;
	}
	
	public boolean startsWith(String prefixe) {
//		Renvoie true si et seulement si prefixe est un prï¿½fixe de
//		la chaï¿½ne.
		if(prefixe.lesCaracteres.length > lesCaracteres.length) {
			return false;
		}
		for (int i=0; i<prefixe.length(); i++ ) {
			if (lesCaracteres[i] != prefixe.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static String valueOf (boolean b) {
<<<<<<< HEAD
//		Retourne la reprï¿½sentation en chaï¿½ne du boolï¿½en b
		return b? CHAINE_TRUE:CHAINE_FALSE;
=======
//		Retourne la représentation en chaîne du booléen b
		// TODO A finir
		return new String();
>>>>>>> branch 'master' of https://github.com/keserz/JAVA
	}

	public static String valueOf(char c) {
<<<<<<< HEAD
//		Retourne la reprï¿½sentation en chaï¿½ne du caractï¿½re c
		return new String(new char[] {c},0,1);
=======
//		Retourne la représentation en chaîne du caractère c
		// TODO A finir
		return new String();
>>>>>>> branch 'master' of https://github.com/keserz/JAVA
	}

	public static String valueOf(int i) {
<<<<<<< HEAD
//		Retourne la reprï¿½sentation en chaï¿½ne de lï¿½entier i.
=======
//		Retourne la représentation en chaîne de l’entier i.
		// TODO A finir
>>>>>>> branch 'master' of https://github.com/keserz/JAVA
		return new String();
	}
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////// MAIN //////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
	
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

	}

}
