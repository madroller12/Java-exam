package progettodue;

import fond.io.*;

public class EsecuzioneRettangolo {

	public static void main(String[] args) {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		out.writeln("inserisci valore per la base del rettangolo 1: ");
		int base = 	in.readInt();
		out.writeln(base);
		out.writeln("inserisci valore per la altezza del rettangolo 1: ");
		int altezza = in.readInt();
		out.writeln(altezza);
		//nome della classe - nome dell'oggetto = new - nome del costruttore(eventuali parametri)
		Rettangolo r1 = new Rettangolo(base, altezza);
		//per richiamare il metodo prendo oggetto.nome del metodo(eventuali parametri)
		int p = r1.perimetro();
		out.writeln("Perimetro del rettangolo 1: " + p + "\n");
		int a = r1.area();
		out.writeln("Area del rettangolo 1: " + a + "\n");
		
		/*out.writeln("il perimetro e': "+r1.perimetro());*/
		
		out.writeln("inserisci valore per la base del rettangolo 2: ");
		base = 	in.readInt();
		out.writeln(base);
		out.writeln("inserisci valore per la altezza del rettangolo 2: ");
		altezza = in.readInt();
		out.writeln(altezza);
		//nome della classe - nome dell'oggetto = new - nome del costruttore(eventuali parametri)
		Rettangolo r2 = new Rettangolo(base, altezza);
		//per richiamare il metodo prendo oggetto.nome del metodo(eventuali parametri)
		p = r2.perimetro();
		out.writeln("Perimetro del rettangolo 2: " + p + "\n");
		a = r2.area();
		out.writeln("Area del rettangolo 2: " + a + "\n");
		/*out.writeln("il perimetro e': "+r1.perimetro());*/
	}

}
