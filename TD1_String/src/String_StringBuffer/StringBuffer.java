package String_StringBuffer;

import java.util.Arrays;

class StringBuffer extends Object {
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////ATTRIBUTS ///////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	





	private char[] lesCaracteres;
	private int n; // le nombre effectif de caract�res pr�sents dans le tableau
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////CONSTRUCTEURS /////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	public StringBuffer() {
//		Permet d�obtenir une instance repr�sentant la cha�ne vide,
//		avec un tampon de 16 caract�res.
		// if l inférieur a 0 throw new exception capacité interdite
//		n=0;
//		lesCaracteres = new char[n+16];
		
		this(16);
	}

	public StringBuffer(int longueur) {
//		Permet d�obtenir une instance repr�sentant la cha�ne vide,
//		avec un tampon de "longueur" caract�res.
		n=0;
		lesCaracteres = new char[longueur];
	}
	
	public StringBuffer(String str) {
//		Permet d�obtenir une instance repr�sentant la cha�ne str,
//		avec un tampon de str.length()+16 caract�res.
		this(16+str.length());
		for(int i = 0; i<str.length();i++) {
			this.lesCaracteres[i]=str.charAt(i);
		}
		n=str.length();
		
	}
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////METHODES ////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	public int length() {
//		Retourne le nombre de caract�res de la cha�ne.
		return n
	}
	public int capacity() {
//		Retourne la capacit� du tampon. (tampon = taille totale
		return lesCaracteres.length;
	}
	public void ensureCapacity(int	capaciteMin) {
//		Assure que le tableau lesCaracteres a une taille
//		d�au moins capaciteMin �l�ments.
		if (lesCaracteres.length>= capaciteMin) {
			return;
		}
		char[] stock = new char[capaciteMin];
		for (int i=0; i<n;i++) {
			stock[i]=lesCaracteres[i];
		}
		lesCaracteres=stock;
		
	}
	
	public StringBuffer append(String s) {
//		Modifie la cha�ne en lui concat�nant la cha�ne de caract�res s.
		ensureCapacity(n+s.length());
		
		for(int i=n;i<s.length();i++) {
			lesCaracteres[i]=s.charAt(i-n);
		}
		n=n+s.length();
		return this;
	}
	
	public StringBuffer replace(int debut, int fin, String s) {
//		Remplace les caract�res de d � f exclu par la cha�ne s.
		int accr=s.length()-fin+debut;
		ensureCapacity(n+accr);
		
	}
	public StringBuffer delete(int debut, int fin) {
//		Supprime tous les caract�res d�indices d � f exclu.
	}
	public StringBuffer insert(int debut, String s) {
//		Ins�re la cha�ne s � l�indice d.
	}
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////MAIN //////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
