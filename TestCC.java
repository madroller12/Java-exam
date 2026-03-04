package esercizijavetta;

import fond.io.*;

public class TestCC {

	static InputWindow in = new InputWindow();
	static OutputWindow out = new OutputWindow();
	
	public static void main(String[] args) {
		
		Persona marco = new Persona("Marco", "Rossi", 1568, "MR123CIAO", 123456);
		Persona alessandro = new Persona("Alessandro","Magno",235,"AM255CIAU", 654321);
		Persona angelo = new Persona("Angelo","Ditu",2002,"DTINLN02L17Z129S", 321456);
		
		Persona[] array = new Persona[3];
		array[0] = marco;
		array[1] = alessandro;
		array[2] = angelo;
		
		ContoCorrente cc1 = new ContoCorrente("IBAN12345IT", marco, alessandro);
		ContoCorrente cc2 = new ContoCorrente("IBAN98545IT", marco);
		ContoCorrente cc3 = new ContoCorrente("123456IBAN", angelo, alessandro);
		
		out.writeln("Inserisci la persona che vuole effettuare operazioni sul CC: 1) Marco\n 2) Alessandro\n 3) Angelo\n");
		int scelta = in.readInt();
		
		if (scelta == 1) {
			//accesso per marco
			out.writeln("Inserisci il tuo PIN: ");
			int pin = in.readInt();
			if (pin == marco.getPINsegreto()) {
				out.writeln("Hai effettuato l'accesso");
				menu(cc1);
			}
			else {
				out.writeln("Il PIN e' errato");
			}
		}
		if (scelta == 2) {
			out.writeln("Inserisci il tuo PIN");
			int pin = in.readInt();
			if (pin == alessandro.getPINsegreto()) {
				out.writeln("Hai effettuato l'accesso");
				menu(cc2);
			}
			else {
				out.writeln("Il PIN e' errato");
			}
		}
		if (scelta == 3) {
			out.writeln("Inserisci il tuo PIN");
			int pin = in.readInt();
			if (pin == angelo.getPINsegreto()) {
				out.writeln("Hai effettuato l'accesso");
				menu(cc3);
			}
			else {
				out.writeln("Il PIN e' errato");
			}
		}
	

	}
	
	static void menu(ContoCorrente cc) {
	while (true) {
	out.writeln("Scegli l'operazione da effettuare: 1) Preleva\n 2) Deposita\n 3) Controlla il saldo\n");
	int sceltaMenu = in.readInt();
	
	switch (sceltaMenu) {
		case 1: 
			out.writeln("Quanto vuoi prelevare?");
			int qpreleva = in.readInt();
			cc.preleva(qpreleva);
			break;
	
		case 2:
			out.writeln("Di quanto vuoi depositare?");
			int quantita = in.readInt();
			cc.deposita(quantita);
			break;
		
		case 3: 
			out.writeln(cc.stampasaldo());
		
		default:
			out.writeln("Inserisci un operazione esistente");
			
	}
	}
	}
	
}

