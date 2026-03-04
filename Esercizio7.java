import fond.io.InputWindow;
import fond.io.OutputWindow;
import java.io.*;
public class Esercizio7 {

	public static void main(String[] args) throws InterruptedException{
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		int nPersone = 0, età = 0, etàTot = 0;
		
		String nome = "";
		
		
		nPersone = in.readInt("Inserisci il numero di persone di cui vuoi calcolare l'età: ");
		out.writeln("Il numero di persone è " + nPersone + "\n\n");
		
		for (int i = 0; i < nPersone; i++) {
			nome = in.readString("Inserisci il nome della persona " + (i + 1) + ": ");
			out.writeln("Il nome inserito è " + nome);
			
			età = in.readInt("Inserisci l'età di " + nome + ": ");
			out.writeln("L'età inserita è " + età + "\n");
			
			etàTot += età;
		}
		
		out.writeln("La media delle persone inserite è " + (etàTot / nPersone));
		
		
		//System.out.println(nPersone + " " + età);
		
		
		
		
		
	}

}
