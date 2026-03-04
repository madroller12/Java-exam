import fond.io.InputWindow;
import fond.io.OutputWindow;
import java.io.*;
public class Esercizio5 {

	public static void main(String[] args) throws InterruptedException{
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		out.writeln("				MENU:\nSi - per continuare\nNo - per uscire");
		
		String s = in.readString().toLowerCase().trim();
		
		while (!s.equals("si") && !s.equals("no")) {
			out.writeln("Inserisci SI o NO");
			s = in.readString().toLowerCase();
		}
		
		if (s.equals("si")) {
			out.writeln("CODICE IN SEGUAZIONE...");
			Thread.sleep(1000);
			System.exit(0);
		}
		else {
			out.writeln("CODICE TERMINATO!");
			Thread.sleep(1000);
			System.exit(0);
		}
		
		
	}

}
