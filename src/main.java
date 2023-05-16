
public class main{

	public static void main(String[] args) {
	
		frigorifero a=new frigorifero("A", 50);
		frigorifero b=new frigorifero("A+", 100);
		frigorifero c=new frigorifero("A++", 150);
		a.stampa(); a.prezzo();
		b.stampa(); b.prezzo();
		c.stampa(); c.prezzo();	
		}
	}