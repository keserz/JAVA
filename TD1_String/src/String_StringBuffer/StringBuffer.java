package String_StringBuffer;

class StringBuffer extends Object {
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////ATTRIBUTS ///////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	private char[] lesCaracteres;
	private int n; // le nombre effectif de caractères présents dans le tableau
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////CONSTRUCTEURS /////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	public StringBuffer() {
//		Permet d’obtenir une instance représentant la chaîne vide,
//		avec un tampon de 16 caractères.
	}

	public StringBuffer(int longueur) {
//		Permet d’obtenir une instance représentant la chaîne vide,
//		avec un tampon de "longueur" caractères.
	}
	
	public StringBuffer(String str) {
//		Permet d’obtenir une instance représentant la chaîne str,
//		avec un tampon de str.length()+16 caractères.
	}
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////METHODES ////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	public int length() {
//		Retourne le nombre de caractères de la chaîne.
	}
	public int capacity() {
//		Retourne la capacité du tampon.
	}
	public void ensureCapacity(int	capaciteMin) {
//		Assure que le tableau lesCaracteres a une taille
//		d’au moins capaciteMin éléments.
	}
	
	public StringBuffer append(String s) {
//		Modifie la chaîne en lui concaténant la chaîne de caractères s.
	}
	
	public StringBuffer replace(int debut, int fin, String s) {
//		Remplace les caractères de d à f exclu par la chaîne s.
	}
	public StringBuffer delete(int debut, int fin) {
//		Supprime tous les caractères d’indices d à f exclu.
	}
	public StringBuffer insert(int debut, String s) {
//		Insère la chaîne s à l’indice d.
	}
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////MAIN //////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
