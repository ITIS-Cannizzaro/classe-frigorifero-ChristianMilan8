
public class frigorifero {
	
		double Prezzo;
		String Classe;
		int litri;
		double valore=0;
		
		public frigorifero(String Classe,int Litri) {
			this.Classe=Classe;
			this.litri=Litri;
		}
		
		public String getClas() {
			return Classe;
		}
		
		public int getLitri() {
			return litri;
		}
		public void stampa() {
			System.out.println("Frigo di classe "+ Classe +", di "+litri+" Litri");
		}
		public void prezzo() {
			if (Classe=="A") {
				valore=5;
			}
			else if (Classe=="A+") {
				valore=1.5;
			}
			else if (Classe=="A++") {
				valore=2;
			}
			Prezzo=5*litri*valore;
			System.out.println("Il prezzo del frigo di classe "+Classe+" di "+litri+" Litri è "+ Prezzo+ " Euro");
		}

	}

