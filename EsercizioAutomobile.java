import fond.io.InputWindow;
import fond.io.OutputWindow;
import java.util.Vector;

public class EsercizioAutomobile {

	public static void main(String[] args) {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		out.writeln("--- CONFIGURAZIONE AUTO 1 ---");
		
		String marca = in.readString("Inserisci la MARCA del veicolo: ");
		String modello = in.readString("Inserisci il MODELLO: ");
		String colore = in.readString("Inserisci il COLORE: ");
		String nTelaio = in.readString("Inserisci numero TELAIO: ");
		String targa = in.readString("Inserisci la TARGA: ");
		String carburante = in.readString("Inserisci tipo CARBURANTE: ");
		
		int nPosti = in.readInt("Inserisci numero POSTI: ");
		int vMax = in.readInt("Inserisci velocita MASSIMA: ");
		int maxMarcia = in.readInt("Inserisci marcia MASSIMA");
		
		int velocitaIniziale = 0;
		int marciaIniziale = 0; 
		boolean motoreAcceso = false;
		boolean statusGuasto = false;

		Automobile auto1 = new Automobile(
				velocitaIniziale, 
				marciaIniziale, 
				nPosti, 
				vMax,
				maxMarcia,
				statusGuasto, 
				motoreAcceso, 
				marca, 
				modello, 
				colore, 
				nTelaio, 
				targa, 
				carburante
		);
		
		Automobile auto2 = new Automobile(0, 0, 2, 300, 6, false, false, "Ferrari", "488", "Rosso", "XYZ123", "AA000BB", "Benzina");

		Vector <Automobile> v = new Vector<Automobile>();
		v.add(auto1);
		v.add(auto2);
		
		int scelta = 0, azione = 0;
		
		while(true) {
			out.writeln("Quale macchina vuoi controllare?");
			out.writeln("1. " + auto1.getMarca() + " " + auto1.getModello());
			out.writeln("2. " + auto2.getMarca() + " " + auto2.getModello());
			out.writeln("0. Esci (Exit)");
			
			scelta = in.readInt("Fai la tua scelta: ");
			
			out.writeln("Scegli azione:");
			out.writeln("1. Accedi/Spegni il veicolo");
			out.writeln("2. Cambia marcia");
			out.writeln("3. Accelera");
			out.writeln("4. Frena");
			out.writeln("0. Esci (Exit)");
			
			azione = in.readInt("Fai la tua scelta: ");
			
			if (scelta == 1) {
				Automobile a = auto1;
				
				out.writeln("Hai scelto la prima auto!");
				
				switch (azione) {
				case 1:
					if (a.getVelocita() == 0) {
						a.setOnOff(!a.isOnOff());
						if (a.isOnOff()) {
							out.writeln("La macchina è accesa!");
						}else {
							out.writeln("La macchina è spenta!");
						}
					}else {
						out.writeln("Impossibile spegnere il veicolo!");
					}
					break;
				case 2:
					out.writeln("Vuoi aumentare o dimensionire la marcia?");
					int s = in.readInt("1. Aumentare\n2. Dimensionire");
					
					if (s == 1) {
						if (a.getMarcia() == a.getMaxMarcia()) {
							out.writeln("Non possibile dimensionire la marcia!");
						}else {
							a.setMarcia(a.getMarcia() + 1);
						}
					}else if (s == 2) {
						if (a.getMarcia() == -1) {
							out.writeln("Non possibile dimensionire la marcia!");
						}else {
							a.setMarcia(a.getMarcia() - 1);
						}
					}else {
						out.writeln("Hai sbagliato, provi ancora!");
					}
				case 3:
					
					
					
				case 4:
				case 0:
					break;
				}
				
			} else if (scelta == 2) {
				out.writeln("Hai scelto la Ferrari!");
				
			} else if (scelta == 0) {
				out.writeln("Arrivederci!");
				break;
			} else {
				out.writeln("Scelta non valida!");
			}
		}
	}
}