package String_StringBuffer;

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
	}

	public StringBuffer(int longueur) {
//		Permet d�obtenir une instance repr�sentant la cha�ne vide,
//		avec un tampon de "longueur" caract�res.
	}
	
	public StringBuffer(String str) {
//		Permet d�obtenir une instance repr�sentant la cha�ne str,
//		avec un tampon de str.length()+16 caract�res.
	}
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////METHODES ////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	public int length() {
//		Retourne le nombre de caract�res de la cha�ne.
	}
	public int capacity() {
//		Retourne la capacit� du tampon.
	}
	public void ensureCapacity(int	capaciteMin) {
//		Assure que le tableau lesCaracteres a une taille
//		d�au moins capaciteMin �l�ments.
	}
	
	public StringBuffer append(String s) {
//		Modifie la cha�ne en lui concat�nant la cha�ne de caract�res s.
	}
	
	public StringBuffer replace(int debut, int fin, String s) {
//		Remplace les caract�res de d � f exclu par la cha�ne s.
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
