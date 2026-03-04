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
		//Nome della classe - nome dell'oggetto = new - nome del costruttore(eventuali parametri)
		Rettangolo r1 = new Rettangolo(base, altezza);
		//Per richiamare il metodo prendo il nome dell'oggetto.nome del metodo(eventuali parametri)
		//Calcola perimetro
		int p = r1.perimetro();
		out.writeln("Perimetro del rettangolo 1: " + p + "\n");
		//Calcolo area
		int a = r1.area();
		out.writeln("Area del rettangolo 1: " + a + "\n");
		//Calcola porzione dell'area del rettangolo
		out.writeln("Inserisci un valore tra 0 e 1 per calcolare una porzione di area");  
		double d = in.readDouble();
		out.writeln(d);
		double ris = r1.frazioneArea(d);
		out.writeln("La percentuale d'area individuata e' " + ris );
		//Cambia dimensioni al rettangolo
		out.write("Inserisci la nuova dimensione della base: ");
		int basenuova = in.readInt();
		out.writeln(basenuova);
		out.write("Inserisci la nuova dimensione dell'altezza: ");
		int altezzanuova = in.readInt();
		out.writeln(altezzanuova);
		r1.cambiaDimensioni(basenuova, altezzanuova);
		//Risultati delle operazioni con valori nuovi
		out.writeln("Il nuovo perimetro e' " + r1.perimetro());
		out.writeln("La nuova area e' " + r1.area());
		out.writeln("La nuova percentuale d'area individuata e' " +r1.frazioneArea(ris));
		
		/*out.writeln("il perimetro e': "+r1.perimetro());*/
		
		/*out.writeln("inserisci valore per la base del rettangolo 2: ");
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
		out.writeln("Inserisci un valore tra 0 e 1 per calcolare una porzione di area");
		d = in.readDouble();
		ris = r2.frazioneArea(d);
		out.writeln("La percentuale d'area individuata e' " + ris );
		/*out.writeln("il perimetro e': "+r2.perimetro());*/

		
	
	}

}
