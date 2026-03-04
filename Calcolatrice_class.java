
public class Calcolatrice_class {
	double x, y;
	public Calcolatrice_class(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double mult() {
		return x * y;
	}
	
	public double sotr() {
		return x - y;
	}
	
	public double divis() {
		return x / y;
	}
	
	public double somma() {
		return x + y;
	}
	
}
