package useless;

import java.util.Arrays;

public class Str extends Object {



	////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////// ATTRIBUTS ///////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////



	private char[] lesCaracteres;
	private static Str CHAINE_TRUE = new Str(new char[] {'t','r','u','e'},0,4);
	private static Str CHAINE_FALSE = new Str(new char[] {'f','a','l','s','e'},0,5);


	////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////// CONSTRUCTEURS /////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////



	public Str() {
		//			Permet d’obtenir la chaîne vide.
		this.lesCaracteres = new char[] {};
	}
	
	//-------------------------------------------------------------------------------//
	
	public Str(char[] tab,int d, int f) {
		//			Permet d’obtenir une chaîne de caractères à partir d’une partie du
		//			tableau de caractères tab, commençant en d et finissant en f. Le
		//			caractère d’indice f est exclu.
		lesCaracteres = new char[f-d];
		for (int i = d; i<f; i++) {
			lesCaracteres[i-d]=tab[i];
		}
	}
	
	//-------------------------------------------------------------------------------//
	
	public Str(Str s) {
		//			Permet d’obtenir une chaîne à partir d’une autre chaîne (copie).
		this.lesCaracteres=s.lesCaracteres;
	}



	////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////// METHODES ////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////



	public char charAt(int i) {
		//			Retourne le caractère d’indice i.
		return lesCaracteres[i];
	}
	
	//-------------------------------------------------------------------------------//
	
	public int length() {
		//			Retourne la longueur de la chaîne (nombre de caractères).
		return lesCaracteres.length;
	}
	
	//-------------------------------------------------------------------------------//
	
	public Str subStr(int d,int f) {
		//			Retourne la sous-chaîne depuis d jusqu’à f exclu.
		return new Str(lesCaracteres,d,f);
	}
	
	//-------------------------------------------------------------------------------//
	
	public Str subStr(int d) {
		//			Retourne la sous-chaîne depuis l’indice d jusqu’à la fin.
		return new Str(lesCaracteres,d,lesCaracteres.length-1);
	}
	
	//-------------------------------------------------------------------------------//
	
	public int compareTo(Str s) {
		//			Compare this à s. Renvoie une valeur négative, nulle ou
		//			positive. La comparaison est une comparaison lexicographique.
		int lMin = length()>s.length()?length():s.length();
		for(int i = 0; i<lMin;i++) {
			if (this.lesCaracteres[i]!=s.charAt(i)) {
				return lesCaracteres[i]-s.charAt(i);
			}
		}
		return length()-s.length();
	}
	
	//-------------------------------------------------------------------------------//
	
	public boolean equals(Object obj) {
		//			Compare la chaîne à un objet et retourne true en cas
		//			d’égalité, false sinon.
		if (this.lesCaracteres.length!=((Str) obj).length())
			return false;
		return ((Str)obj instanceof Str) && (this.compareTo((Str)obj)==0);
	}
	
	//-------------------------------------------------------------------------------//
	
	public boolean startsWith(Str prefixe) {
		//			Renvoie true si et seulement si prefixe est un préfixe de la chaîne.
		if (length()<prefixe.length()) 
			return false;

		return this.compareTo(prefixe)==0;
	}
	
	//-------------------------------------------------------------------------------//
	
	public static Str valueOf (boolean b) {
		//			Retourne la représentation en chaîne du booléen b.
		if (b)
			return CHAINE_TRUE;
		return CHAINE_FALSE;
	}
	
	//-------------------------------------------------------------------------------//
	
	public static Str valueOf(char c) {
		//			Retourne la représentation en chaîne du caractère c.
		return new Str(new char[] {c},0,1);
	}
	
	//-------------------------------------------------------------------------------//
	
	public static Str valueOf(int k) {
		//			Retourne la représentation en chaîne de l’entier i.
		boolean n = false;
		if (k==0) 
			return new Str(new char[] {(char)48},0,1);
		
		if (k<0) {
			n=true; // l'information du int negatif est dans ce booleen
			k=k*-1; // car on veut utiliser un nombre positif pour l'algo plus bas
		}
		
		
		char[] contientInt = new char[0];
		for (; k>0;) {// construit un tableau representant l'entier en caracteres mais à l'envers
			int p = k/10;
			int q = k%10;
			k=p;
			contientInt = Arrays.copyOf(contientInt, contientInt.length+1);
			contientInt[contientInt.length-1]=(char)(q+48);
		}
		
		
		char[] danslOrdre = new char[contientInt.length];
		for (int i = contientInt.length; i>0; i--) {
			// construit un tableau danslOrdre qui inverse les caracteres se trouvant dans contientInt
			danslOrdre[contientInt.length-i]=contientInt[i-1];
		}
		
		if (n) {
			// si k est negatif, on rajoute le caracteres - a l'indice 0 en augmentant la taille du tableau de +1
			char[]negDanslOrdre = new char[danslOrdre.length+1];
			negDanslOrdre[0]='-';
			for (int i = 1; i< negDanslOrdre.length;i++) {
				negDanslOrdre[i]=danslOrdre[i-1];
			}
			
			return new Str(negDanslOrdre, 0, negDanslOrdre.length);
		}
		
		return new Str(danslOrdre, 0, danslOrdre.length);
	}
	
	//-------------------------------------------------------------------------------//
	
	public String toString() {
		//return this.lesCaracteres.toString(); / méthode créee dans le but de tester la classe
		
		String chString = "";
		for (int i = 0; i < this.lesCaracteres.length; i++) {
			chString += this.lesCaracteres[i];
		}
		return chString;
		
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////// MAIN ///////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Str.valueOf(00).toString());

	}

}
