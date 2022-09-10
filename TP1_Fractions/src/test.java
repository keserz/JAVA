import java.util.Scanner;

public class test {

    
    public static Fraction extractFraction(String entry) {
    	int i=0;
    	while (i< entry.length() && entry.charAt(i) != '+' && entry.charAt(i) != '-' && entry.charAt(i) != '*'&& entry.charAt(i)!= '=') {
//			System.out.println(entry.charAt(i)+" allo "+ i);
			i++;
		}
    	
		Fraction f3 = new Fraction(entry.substring(0, i));
//		System.out.println("test : "+f3);
		return f3;
    }
    
    public static String extractString(String entry) {
    	int i=0;
    	while (i< entry.length() && entry.charAt(i) != '+' && entry.charAt(i) != '-' && entry.charAt(i) != '*'&& entry.charAt(i)!= '=') {
//			System.out.println(entry.charAt(i)+" allo "+ i);
			i++;
		}
    	entry = entry.substring(i+1, entry.length());
    	return entry;
    }
    
//    public static char operation(String entry) {
//    	int i=0sd;
//    	while (i< entry.length() && entry.charAt(i) != '+' && entry.charAt(i) != '-' && entry.charAt(i) != '*'&& entry.charAt(i)!= '=') {
////			System.out.println(entry.charAt(i)+" allo "+ i);
//			i++;
//		}
//    	System.out.println("test char function : "+entry.charAt(i));
//    	return entry.charAt(i);
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch = "123/53";
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(ch.substring(0, ch.indexOf("/")));
		int d = Integer.parseInt(ch.substring(ch.indexOf("/")+1, ch.length()));
		Fraction f1 = new Fraction(0,1);
		Fraction f2 = new Fraction(1,1);

		System.out.println("Taper une expression terminée par =, la barre de fraction est /");
		String entry = scanner.next();
		System.out.print(entry);

		f1 = extractFraction(entry);
		String teste = entry;
		int i=0;
		while (extractString(teste).length() != 0) {
	    	while (i< entry.length() && entry.charAt(i) != '+' && entry.charAt(i) != '-' && entry.charAt(i) != '*'&& entry.charAt(i)!= '=') {
	//			System.out.println(entry.charAt(i)+" allo "+ i);
				i++;
			}

	    	System.out.println("valeur de i :"+i);
	    	System.out.println(entry.charAt(i));
	    	teste = extractString(teste);
	    	if (entry.charAt(i)=='+') {
	    		System.out.println("test de + f1 :"+f1);
	    		f1=f1.plus(extractFraction(teste));
	    		System.out.println("test de + f1 :"+f1);
	    	}
			if (entry.charAt(i)=='-') {
				System.out.println("test de - f1 :"+f1);
				f1 = f1.moins(extractFraction(teste));
				System.out.println("test de - f1 :"+f1);
			}
		
			if (entry.charAt(i)=='*') {
				System.out.println("test * de f1 :"+f1);
				f1 = f1.fois(extractFraction(teste));
				System.out.println("test * de f1 :"+f1);
			}
			i++;
		
		}
		
		
		
//		while (extractString(teste).length() != 0) {
//			
//			teste = extractString(teste);
//			System.out.println("print ln de teste : "+teste);
//			if (operation(teste)=='+') {
//				System.out.println("test de f1 :"+f1);
//				f1 = f1.plus(extractFraction(teste));
//			}
////			
////			if (operation(teste)=='-') {
////				f1 = f1.moins(extractFraction(teste));
////			}
////			
////			if (operation(teste)=='*') {
////				f1 = f1.fois(extractFraction(teste));
////			}
//			
////			f1 = f1.plus(extractFraction(teste));
//
//			
//		}
//		
		System.out.print(f1);
		
		
		
	}

}
