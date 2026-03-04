import fond.io.InputWindow;
import fond.io.OutputWindow;

public class Calcolatrice {

	public static void main(String[] args) throws InterruptedException {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		int scelta, cont;
		double x = 0, y = 0;
		cont = 0;
		
		Calcolatrice_class c = new Calcolatrice_class(x, y);
		
		while (true) {
			out.writeln("			MENU:\nSelezione un numero:\n1. Somma\n2. Sottrazione\n3. Multiplicazione\n4. Divisione\n5. Esci");
			scelta = in.readInt("Inserisci la tua scelta:");
			if (scelta == 1) {
				x = in.readDouble("Inserisci il primo numero:");
				y = in.readDouble("Inserisci il secondo numero:");
				c = new Calcolatrice_class(x, y);
				out.writeln("Ecco la tua risposta: " + c.somma());
				cont++;
			}
			else if (scelta == 2) {
				x = in.readDouble("Inserisci il primo numero:");
				y = in.readDouble("Inserisci il secondo numero:");
				c = new Calcolatrice_class(x, y);
				out.writeln("Ecco la tua risposta: " + c.sotr());
				cont++;
			}
			else if (scelta == 3) {
				x = in.readDouble("Inserisci il primo numero:");
				y = in.readDouble("Inserisci il secondo numero:");
				c = new Calcolatrice_class(x, y);
				out.writeln("Ecco la tua risposta: " + c.mult());
				cont++;
			}
			else if (scelta == 4) {
				x = in.readDouble("Inserisci il primo numero:");
				y = in.readDouble("Inserisci il secondo numero:");
				while (y == 0) {
					y = in.readDouble("Il secondo numero non può essere 0!\nInserisci il secondo numero:");
				}
				c = new Calcolatrice_class(x, y);
				out.writeln("Ecco la tua risposta: " + c.divis());
				cont++;
			}
			else if (scelta == 5) {
				out.writeln("Hai fatto " + cont + " operazione!\nUsciamo in corso...");
				Thread.sleep(1000);
				out.writeln("3");
				Thread.sleep(1000);
				out.writeln("2");
				Thread.sleep(1000);
				out.writeln("1");
				Thread.sleep(1000);
				System.exit(0);
			}
			else {
				out.writeln("Hai sbagliato, provi inserire ancora!");
			}
		}
	}

}
