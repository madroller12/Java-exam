import java.util.Random;
public class Dado {
	Random r;
	public Dado() {
		this.r = new Random();
	}
	
	public int lancioDado () {
		int risultato = r.nextInt(6);
		return risultato;
	}
}
