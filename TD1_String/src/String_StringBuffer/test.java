package String_StringBuffer;

import java.util.Arrays;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		char tab[] = new char[3];
		char[] lesCaracteres;
		lesCaracteres = new char[]{};
		tab[0] = 'a';
		tab[1] = 'b';
		tab[2] = 'c';
		System.out.println(lesCaracteres.length);
		String s = new String(tab,1,3);
		
		System.out.println(s);
		System.out.println(tab);
		System.out.println(Arrays.toString(tab));
		}
		
	}


