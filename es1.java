package g270126;
import fond.io.InputWindow;
import fond.io.OutputWindow;
import java.util.Vector;

public class es1 extends Object {

	static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	static InputWindow in = new InputWindow();
	static OutputWindow out = new OutputWindow();
	
	public static void stampArray(int[] array) {
		out.writeln("_________________________________");
		for (int i = 0; i < array.length; i++) {
			if (i != (array.length - 1)) {
				out.write(array[i] + ", ");
			}else {
				out.writeln(array[i] + ".");
			}
		}
		out.writeln("_________________________________");
	}
	
	public static int sommaArray(int[] array) {
		int somma = 0;
		for (int i=0; i < array.length; i++) {
			somma += array[i];
		}
		//out.writeln("La somma degli elementi è: " + somma);
		return somma;
	}
	
	public static double mediaArray(int[] array) {
		double media = sommaArray(array) / array.length;
		return media;
	}
	
	public static void presentenzaArray(int[] array) {
		out.writeln("_________________________________");
		int scelta = in.readInt("Scegli un numero che si trova all'interno all'array: ");
		int quant_scelt = 0;
		for (int i = 0; i < array.length; i++) {
			if (scelta == array[i]) {
				quant_scelt += 1;
			}
		}
		if (quant_scelt >= 1) {
			out.writeln("Il numero " + scelta + " è presente all'array e si trova " + quant_scelt + " volte.");
		}else {
			out.writeln("Il numero " + scelta + " non è presente all'array!");
		}
		out.writeln("_________________________________");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		//int numeri = in.readInt("Quanti numeri vuoi inserire: ");
		out.writeln("La grandezza dell'array è " + array.length);
		//int[] num_a = new int[numeri];
		//array = new int(1, 2);
		
		
		/*for (int i = 0; i < array.length; i++) {
			int num = in.readInt("Numero " + (i+1) + ":");
			
			array[i] = num;
			
		}*/
		
		stampArray(array);
		out.writeln("La somma dell'array è " + sommaArray(array) + "\n" +
					"La media dell'array è " + mediaArray(array) + ".");
		presentenzaArray(array);
		
		
		
		
		
		
		
	}
}