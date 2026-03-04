package PacchettoSus;


public class Calcolatrice {
	
	

	double n1;
	double n2;
	int x;

	
	public Calcolatrice(double n1, double n2, int x) {
		this.n1 = n1;
		this.n2 = n2;
		this.x = x;
		
		
	}
	double Somma() {
		double somma = n1 + n2;
		return somma;
	}
	double Sottrazione() {
		double sottrazione = n1 - n2;
		return sottrazione;
	}
	double Moltiplicazione() {
		double moltiplicazione = n1 * n2;
		return moltiplicazione;
	}
	double Divisione() {
	    if (n2 == 0) {
	        return 0;
	    }
	    double divisione = n1 / n2;
	    return divisione;
	}

	
	}
	
	


