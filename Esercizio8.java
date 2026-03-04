import fond.io.InputWindow;
import fond.io.OutputWindow;

public class Esercizio8 {
	static int v1;
	static int v2;
	public static void spostare() {
		int temp = v1;
		v1 = v2;
		v2 = temp; 
		System.out.println("Всередині методу: " + v1 + " " + v2); 
	}

	public static void main(String[] args) throws InterruptedException {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		
		v1 = in.readInt("Inserisci il primo numero:");
		v2 = in.readInt("Inserisci il secondo numero:");
		
		out.writeln("До обміну: " + v1 + " " + v2);
		
		spostare();
		
		out.writeln("Після методу (у main): " + v1 + " " + v2); 
	}
}