public class Rettangolo {
	float base = 0, altezza = 0;
	
	public Rettangolo(float a, float b) {
		super();
		this.base = b;
		this.altezza = a;
	}

	float perimetro() {
		//return (base + altezza) * 2;
		return (base + altezza) * 2;
		
	}
	
	float area() {
		return base * altezza;
	}
	
	float frazioneArea(float f) {
		float fa = area() * f;
		return fa;
	}
	
	void cambioDimensioni (float b, float a) {
		this.base = b;
		this.altezza = a;
	}
	
}
