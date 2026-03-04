package progettodue;

public class Rettangolo {

	int base = 0;
	int altezza = 0;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	int perimetro() {
		/*return((base+altezza)*2);*/ //modo 1	
		int p = ((base+altezza)*2);
		return p;  //modo 2
	}
	
	int area() {
		return(base*altezza);
	}
	
	double frazioneArea(double f) {
		double fa = area()*f;
		return fa;
		}
	
	void cambiaDimensioni(int b, int a) {
		this.base = b;
		this.altezza = a;
	}
}
