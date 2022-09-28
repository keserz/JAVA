package useless;


import java.util.Arrays;

class Str_Builder extends Object {
	
	
	
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////ATTRIBUTS ///////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	


	private char[] lesCaracteres;
	private int n; // le nombre effectif de caract�res pr�sents dans le tableau
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////CONSTRUCTEURS /////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	
	
	public Str_Builder() {
//		Permet d�obtenir une instance repr�sentant la cha�ne vide,
//		avec un tampon de 16 caract�res.
		// if l inférieur a 0 throw new exception capacité interdite
//		n=0;
//		lesCaracteres = new char[n+16];
		
		this(16);
	}
	
	//-------------------------------------------------------------------------------//
	
	public Str_Builder(int longueur) {
//		Permet d�obtenir une instance repr�sentant la cha�ne vide,
//		avec un tampon de "longueur" caract�res.
		n=0;
		lesCaracteres = new char[longueur];
	}
	
	//-------------------------------------------------------------------------------//
	
	public Str_Builder(Str str) {
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
		return n;
	}
	
	//-------------------------------------------------------------------------------//
	
	public int capacity() {
//		Retourne la capacit� du tampon. (tampon = taille totale
		return lesCaracteres.length;
	}
	
	//-------------------------------------------------------------------------------//
	
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
	
	//-------------------------------------------------------------------------------//
	
	
	public Str_Builder append(Str s) {
//		Modifie la cha�ne en lui concat�nant la cha�ne de caract�res s.
		ensureCapacity(n+s.length());
		
		for(int i=n;i<s.length();i++) {
			lesCaracteres[i]=s.charAt(i-n);
		}
		n=n+s.length();
		return this;
	}
	
	//-------------------------------------------------------------------------------//
	
	
	public Str_Builder replace(int debut, int fin, Str s) {
//		Remplace les caract�res de d � f exclu par la cha�ne s.
		int longueur = lesCaracteres.length;
		int accr=s.length()-fin+debut;
		ensureCapacity(n+accr);
//		code d'ARMEN
//		 if (s.length() > fin - debut) {
//	            
//	            
//	            accr = s.length()-(debut+fin);
//	            ensureCapacity(n + accr);
//	            //f = s.length();
//	            
//	            char [] newArr = new char[n-fin];
//	            System.out.println("LES CARACTERES : " + Arrays.toString(lesCaracteres));
//	            System.out.println("N-F = " + (n-fin));
//	            for (int k = fin; k < n; k++) {
//	                newArr[k-fin] = lesCaracteres[k];
//	                System.out.println("OPOPOP: " + k);
//	            }
//	            System.out.println("TEST : " + Arrays.toString(newArr));
//	            Str str = new Str(lesCaracteres, fin, n+1);
//	            System.out.println("LALALA : " + str);
//	            
//	            for (int i = debut; i <= s.length(); i++) {
//	                lesCaracteres[i] = s.charAt(i - debut);
//	                System.out.println(lesCaracteres[i]);
//	            }
//	            
//	            this.append(new Str(newArr, 0, newArr.length));
//	            
//	            //System.out.println(Arrays.toStr(lesCaracteres));
//	            
//	            n = n + accr;
//	            return this;
//	        }
//	        return new Str_Builder();
//		
		//-------------------------------------------------------------------------------//
		System.out.println("hello");
		System.out.println(debut+s.length()-fin-1);
		System.out.println(longueur);
		System.out.println(lesCaracteres.length);
		System.out.println(s.length());
		
		for (int i = debut+s.length()-fin-1; i>fin;i--) {
			lesCaracteres[i] = lesCaracteres[i-fin-1];
			System.out.println("hello");
		}
		
		for (int i = 0; i>s.length() ;i++) {
			lesCaracteres[debut+i] = s.charAt(i);
		}
		
		
		
//		for (int i = 0; i<n-fin; i++) {
//			lesCaracteres[debut+s.length()+i] = lesCaracteres[fin+i];
//		}
//		
//		for(int i = 0; i<s.length(); i++) {
//			lesCaracteres[debut+i] = s.charAt(i);
//		}
		
		n=n+accr;
		
		return new Str_Builder(new Str(lesCaracteres,0,lesCaracteres.length));
		
		
	}
	public Str_Builder delete(int debut, int fin) {
//		Supprime tous les caract�res d�indices d � f exclu.
	}
	public Str_Builder insert(int debut, Str s) {
//		Ins�re la cha�ne s � l�indice d.
	}
	
	public String toString() {
		//return this.lesCaracteres.toString(); / m�thode cr�ee dans le but de tester la classe
		
		String chString = "";
		for (int i = 0; i < this.lesCaracteres.length; i++) {
			chString += this.lesCaracteres[i];
		}
		return chString;
		
	}
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////MAIN //////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] tab = new char[10];
//		char[] test = new char [7];
//		int longueur = tab.length;
//		for(int i = 0; i<tab.length;i++) {
//			tab[i]=(char) (i+48);
//		}
//		
//		for(int i = 0; i<test.length;i++) {
//			test[i]=(char) (i+48);
//		}
//		
//		System.out.println(tab);
//		System.out.println(test);
//		
//		tab = Arrays.copyOf(tab, 15);
//		System.out.println(Arrays.toString(tab));
//		int d = 2;
//		int f = 4;
//		int k = d+test.length+longueur-f;
//		System.out.println(k);
//		for (int i =d+test.length+longueur-f-1; i>f; i-- ) {
//			System.out.println(i-f);
//			System.out.println(tab.length);
//			tab[i] = tab[i-f-1];
//			System.out.println("test de tab : "+Arrays.toString(tab));
//		}
//		
//		for(int i = 0; i<test.length;i++) {
//			tab[d+i]=test[i];
//		}
//		System.out.println(Arrays.toString(test));
//		System.out.println(Arrays.toString(tab));
		
		Str str1 = new Str(new char[] {'a','b','c','d','e','f','g'},0,7);
		Str str2 = new Str(new char[] {'h','i','k','l','m','n','o'},0,7);
		
		Str_Builder testStrb1 = new Str_Builder(str1);
		
		System.out.println(testStrb1.replace(2, 4, str2).toString());
		
		}
	}

