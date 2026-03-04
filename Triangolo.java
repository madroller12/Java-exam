public class Triangolo {
	
	int lato1;
	int lato2;
	int lato3;
	double altezza;
	char tipoTriangolo;
	int base;
	int l;
	
	//Metodo Costruttore
	public Triangolo(int lato1, int lato2, int lato3) {
		
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
 
	}
	
	//Metodo Determinazione Triangolo
	public char determinazione_Triangolo(){
		if(lato1 == lato2 && lato2 == lato3) {
			
			tipoTriangolo = 'E';
			return('E');
		}
		else if(lato1 != lato2 && lato2 != lato3 && lato3 != lato1) {
			tipoTriangolo = 'S';
			return('S');
		}
		else {
			if(lato1 == lato2) {
				l = lato1;
				base = lato3;
			}
			if(lato2 == lato3) {
				l= lato2;
				base = lato1;
			}
			
			tipoTriangolo = 'I';
			return('I');
			
		}		
	}
	
	//Metodo Calcolo Perimetro
	public int perimetro() {
		
		return lato1 + lato2 + lato3;
	}
	
	//Metodo Calcolo Area
	public double area() {
		determinazione_Triangolo();
		
		//se isoscele sqrt lato di uno dei due uguali - (laltro lato / 2)>2
		if(tipoTriangolo == 'I') {
		
			altezza = Math.sqrt(((l*l) - ((base / 2) *( base / 2))));
				
		}
		
		return (base*altezza) / 2;	
	}
	
	public double area(double semiP) {
		return Math.sqrt(semiP * (semiP - lato1) * (semiP - lato2) * (semiP - lato2));
	}
	
	
  
}
 
 