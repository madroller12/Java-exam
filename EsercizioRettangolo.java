import fond.io.*;
public class EsercizioRettangolo {

	public static void main(String[] args) {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		float base = in.readFloat("Inserisci il base di rettangolo: ");
		float altezza = in.readFloat("Inserisci l'altezza di rettangolo: ");
		float frazione_area = in.readFloat("Inserisci un valore tra 0 e 1 per calcolare una porzione di area: ");
		while (frazione_area <= 0 || frazione_area >= 1) {
			frazione_area = in.readFloat("Inserisci un valore tra 0 e 1 per calcolare una porzione di area, hai sbagliato: ");
		}
		
		Rettangolo r1 = new Rettangolo(base, altezza);
		out.writeln("Il perimetro è " + r1.perimetro());
		out.writeln("L'area è " + r1.area());
		out.writeln("Il porzione di area è " + r1.frazioneArea(frazione_area));
		
		base = in.readFloat("Inserisci il base di rettangolo: ");
		altezza = in.readFloat("Inserisci l'altezza di rettangolo: ");
		frazione_area = in.readFloat("Inserisci un valore tra 0 e 1 per calcolare una porzione di area: ");
		while (frazione_area <= 0 || frazione_area >= 1) {
			frazione_area = in.readFloat("Inserisci un valore tra 0 e 1 per calcolare una porzione di area, hai sbagliato: ");
		}
		
		Rettangolo r2 = new Rettangolo(base, altezza);
		out.writeln("Il perimetro è " + r2.perimetro());
		out.writeln("L'area è " + r2.area());
		out.writeln("Il porzione di area è " + r2.frazioneArea(frazione_area));
		
	}

}
