public class Fraction {
	//bonjour
    int n,d;
    
    
    public Fraction() {
        n = 0;
        d = 1;
    }
    
    public Fraction(int n) {
        this.n = n;
        d = 1;
    }
    
    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;    
    }
    
    public Fraction(String ch) {
        this.n = Integer.parseInt(ch.substring(0, ch.indexOf("/")));
        this.d = Integer.parseInt(ch.substring(ch.indexOf("/")+1, ch.length()));
    }
    
    public int getNumerateur() {
        return n;
    }
    
    public int getDenominateur() {
        return d;
    }
    
    public void setNumerateur(int n){
        this.n=n;
    }
    
    public void setDenominateur(int d) {
        this.d=d;
    }
    
    public String toString() {
        String ch = this.n+"/"+this.d;
        return ch;
    }
    
    public static Fraction valueOf(String ch) {
        Fraction f = new Fraction(ch);
        return f;
    }
    
    public int compareTo(Fraction f) {
        return moins(f).n;
        
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Fraction)  {
            if (this.compareTo((Fraction)obj) == 0) {
                return true;
            }
        }
        return false;
    }
    
    public Fraction plus(Fraction f) {
        int num = this.getNumerateur()*f.getDenominateur()+this.getDenominateur()*f.getNumerateur();
        int den = this.getDenominateur()*f.getDenominateur();
        
//        System.out.println(pgcd(num,den));
 
        return new Fraction(num/pgcd(num,den),den/pgcd(num,den));
    }
    
    public Fraction moins(Fraction f) {
        int num = this.getNumerateur()*f.getDenominateur()-this.getDenominateur()*f.getNumerateur();
        int den = this.getDenominateur()*f.getDenominateur();
        return new Fraction(num/pgcd(num,den),den/pgcd(num,den));
    }
    
    public Fraction fois(Fraction f) {
        int num = this.getNumerateur()*f.getNumerateur();
        int den = this.getDenominateur()*f.getDenominateur();
        return new Fraction(num/pgcd(num,den),den/pgcd(num,den));
    }
    
    public Fraction divisePar(Fraction f) {
    	int num = this.getNumerateur()*f.getDenominateur();
    	int den = this.getDenominateur()*f.getNumerateur();
    	return new Fraction(num/pgcd(num,den),den/pgcd(num,den));
    }
    
    public int pgcd(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return pgcd(b, a % b);
    }
    
}