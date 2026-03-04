package tecniche_programmazione;

import java.util.Vector;

import fond.io.InputWindow;
import fond.io.OutputWindow;

public class EsecAutomobile {

	public static void main(String[] args) {
		
		InputWindow input = new InputWindow();
		OutputWindow output = new OutputWindow();
		
		/*
		
		output.writeln("Inserisci la marca del veicolo: ");
		String marca = input.readString();
		
		output.writeln("Inserisci la modello del veicolo: ");
		String modello = input.readString();
		
		output.writeln("Inserisci il colore del veicolo: ");
		String colore = input.readString();
		
		output.writeln("Inserisci la targa del veicolo: ");
		String targa = input.readString();
		
		output.writeln("Inserisci il numero del telaio del veicolo: ");
		String nTelaio = input.readString();
		
		output.writeln("Inserisci il numero dei posti del veicolo: ");
		int nPosti = input.readInt();
		
		output.writeln("Inserisci il tipo di carburante del veicolo: ");
		String carburante = input.readString();
		
		output.writeln("Inserisci la velocità massima del veicolo: ");
		int vMax = input.readInt();
		
		output.writeln("Inserisci la marcia massima del veicolo: ");
		int maxMarcia = input.readInt();
		
		Automobile auto1 = new Automobile(0, false, 0, marca, modello, colore, nTelaio, targa, nPosti, carburante, vMax, maxMarcia);
		*/
		Automobile auto1 = new Automobile(0, false, 0, "Fiat", "500", "Gialla", "1011121314", "HA124DS", 5, "Diesel", 150, 5, 50, 5);
		Automobile auto2 = new Automobile(0, false, 0, "Mercedes", "Classe A", "Nero", "123456789", "HA123DS", 5, "Benzina", 150, 5, 70, 5);
		
		// Automobile[] auto = new Automobile[2];
		// auto[x]
		/*
		for(int i = 0; i < 2; i++) {
			if(i == 0) {
				auto1.
			} else {
				auto2
			}
		} */
		
		// scelta: sceglo l'automobile da utilizzare
		// azione: cosa voglio fare con quell'automobile
		int scelta = 0;
		int azione = 0;
		
		while(true) {
			output.writeln("Quale macchina vuoi controllare: ");
			output.writeln("1) " + auto1.getMarca() + " " + auto1.getModello());
			output.writeln("2) " + auto2.getMarca() + " " + auto2.getModello());
			
			scelta = input.readInt();
			
			output.writeln("Esegui un azione: ");
			output.writeln("1) Accendi/Spegni il veicolo");
			output.writeln("2) Cambia marcia");
			output.writeln("3) Accelera");
			output.writeln("4) Frena");
			output.writeln("5) Rifornisci");
			output.writeln("6) Spostamento");
			azione = input.readInt();
			//output.write("");
			
			Automobile a = null;
			
			//Vector<Automobile> v = new Vector<Automobile>(); 
			//v.add(auto1);
			//v.add(auto2);
			
			
			
			if(scelta == 1) {
				
				a = auto1;
				
			} else if(scelta == 2) {
			
				a = auto2;
				
			}
			
			switch(azione) {
			case 1:
				
				if(a.getqCarburante() == 0) {
					// se il serbatoio è vuoto non si può accendere il veicolo
					output.writeln("Il serbatoio è vuoto, impossibile accendere il veicolo!");
					break;
				}
				
				if(a.getVelocita() == 0) {
					a.setOnOff(!a.getOnOff());
					if(a.getOnOff()) {
						output.writeln("La macchina è accesa!");
					} else {
						output.writeln("La macchina è spenta!");
					}
				} else {
					output.writeln("Impossibile spengere il veicolo!");
				}
				
				break;
			case 2:
				output.writeln("Vuoi aumentare o diminuire la marcia?");
				output.writeln("1) Aumentare");
				output.writeln("2) Diminuire");
				int s = input.readInt();
				
				if(s == 1) {
					if(a.getMarcia() == a.getMaxMarcia()) {
						output.writeln("Hai raggiunto la marcia massima!");
					} else a.setMarcia(a.getMarcia() + 1);
				} else if(s == 2) {
					if(a.getMarcia() == -1) {
						output.writeln("Hai raggiunto la marcia minima!");
					} else a.setMarcia(a.getMarcia() - 1);
				}
				
				output.writeln(a.getMarcia());
				
				break;
			case 3:
				
				output.writeln("Di quanti Km/h vuoi accellerare?");
				int v = input.readInt();
				
				if(a.getVelocita() + v > a.getVMax()) {
					a.setVelocita(a.getVMax());
				} else a.setVelocita(a.getVelocita() + v);
				
				a.impostaMarcia();
				
				output.writeln(a.getVelocita());
				
				break;
			case 4:
				
				output.writeln("Di quanti Km/h vuoi decelerare?");
				int d = input.readInt();
				
				if(a.getVelocita() - d < 0 && a.getVelocita() > 0) {
					a.setVelocita(0);
				} else a.setVelocita(a.getVelocita() - d);
				
				a.impostaMarcia();
				
				output.writeln(a.getVelocita());
				break;
			case 5:
				
				output.writeln("Di quanti litri vuoi rifornire?");
				double r = input.readDouble();
				
				while(r > a.getqCarburanteMax() - a.getqCarburante()) {
					output.writeln("Puoi inserire massimo " + (a.getqCarburanteMax() - a.getqCarburante()) + " litri di " + a.getCarburante());
					r = input.readDouble();
				}
				
				if(a.getqCarburante() + r > a.getqCarburanteMax()) a.setqCarburante(a.getqCarburanteMax());
				else a.setqCarburante(a.getqCarburante() + r);
				
				output.writeln("Hai a disposizione " + a.getqCarburante() + " di " + a.getCarburante());
				
				break;
			case 6: 
				output.writeln("Di quanti Km vuoi percorrere?");
				int p = input.readInt();
				
				String finale = a.calcConsumo(p);
				output.writeln(finale);
				
				break;
				
			}
			
			if(scelta == 1) auto1 = a;
			else if(scelta == 2) auto2 = a;

		}

	}

}
