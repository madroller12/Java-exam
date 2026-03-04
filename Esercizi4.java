import fond.io.InputWindow;
import fond.io.OutputWindow;

public class Esercizi4 {

	public static void main(String[] args) throws InterruptedException{
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		//float a = in.readFloat();
		//float b = in.readFloat();
		
		/*if (a % 2 == 0) {
			out.write("Il numero è pari!");
		}
		else {
			out.write("Il numero è dispari!");
		}*/
		
		/*if (a < 0) {
			out.write("Il numero è negativo!");
		}
		else if (a > 0) {
			out.write("Il numero è positivo!");
		}
		else {
			out.write("Il numero è nullo!");
		}*/
		
		/*if (a > b) {
			out.write("Il numero " + a + " è maggiore di " + b);
		}
		else if (b > a) {
			out.write("Il numero " + b + " è maggiore di " + a);
		}
		else {
			out.write("I numeri sono uguali!");
		}*/
		
		
		/*
		out.writeln("Inserisci un numero da 1 a 10: ");
		float a = in.readFloat();
		while (a < 1 || a > 10) {
			out.writeln("Hai inserito il numero non è verificato, provi ancora");
			a = in.readFloat();
		}
		for (int i = 1; i < 11; i++) {
			out.writeln(a * i);
		}*/
		
		/*boolean b = false;
		
		do {
			out.writeln("Inserisci un numero da 1 a 10: ");
			float a = in.readFloat();
			
			
			out.writeln("Il numero inserito è: " + a);
			
			if (a < 11 && a > 0) {
				b = true;
				for (int i = 1; i < 11; i++) {
					out.writeln(a * i);
				}
			}
			else {
				out.writeln("Il numero inserito è sbagliato!");
			}
			
		} while (b == false);
		
		out.writeln("Ho saltato il ciclo e proseguo.");
		
		*/
		
		do {
			out.writeln("			MENU:\n1. Digita 1 per proseguire\n2. Digigta 0 per uscire");
			float a = in.readFloat();
			float n1;
			if (a != 1 && a != 0) {
				out.writeln("Hai sbagliato, inserisci ancora!");
			}
			else if (a == 1) {
				out.writeln("BRAVO!");
				Thread.sleep(1000);
				out.writeln("         /\"\\\r\n"
						+ "        |\\./|\r\n"
						+ "        |   |\r\n"
						+ "        |   |\r\n"
						+ "        |>*<|\r\n"
						+ "        |   |\r\n"
						+ "     /'\\|   |/'\\\r\n"
						+ " /'\\|   |   |   |\r\n"
						+ "|   |   |   |   |\\\r\n"
						+ "|   |   |   |   |  \\\r\n"
						+ "| *   *   *   * |>  > \r\n"
						+ "|                  /\r\n"
						+ " |               /\r\n"
						+ "  |            /\r\n"
						+ "   \\          |\r\n"
						+ "    |         |");
				Thread.sleep(5000);
				out.writeln("\n\n\n\n\nIo scherzo:D");
				Thread.sleep(2500);
				out.writeln("\nInserisci un numero da 1 a 10: ");
				n1 = in.readFloat();
				out.writeln("Il numero inserito è " + n1);
				Thread.sleep(1000);
				out.writeln("Calcolo la tabellina...");
				while (n1 < 1 || n1 > 10) {
					out.writeln("Hai inserito il numero non è verificato, provi ancora");
					n1 = in.readFloat();
				}
				for (int i = 1; i < 11; i++) {
					out.writeln(n1 * i);
					Thread.sleep(500);
				}
			}
			else if (a == 0) {
				out.writeln("Lo facciamo...");
				Thread.sleep(1000);
				out.writeln("3");
				Thread.sleep(1000);
				out.writeln("2");
				Thread.sleep(1000);
				out.writeln("1");
				Thread.sleep(1000);
				System.exit(0);
			}
		} while (true);
		
		
		
		
		
		
		
		
		
		
		
		
		/*Thread.sleep(3000);
		System.exit(0);*/
	}

}
