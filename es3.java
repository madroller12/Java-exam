package g270126;
import fond.io.InputWindow;
import fond.io.OutputWindow;

public class es3 {
	static InputWindow in = new InputWindow();
	static OutputWindow out = new OutputWindow();
	public static void main(String[] args) {
		//int righe = in.readInt("Inserisci quantita di righe della matrice:");
		//int colonne = in.readInt("Inserisci quantita di colonne della matrice:");

		//String[][] m = new String[righe][colonne];
		//out.writeln("E' stata creata la matrice con " + righe + " righe e " + colonne + " colonne");
		
		String[][] m = {
			{
				"Federico", "Edoardo", "Gianni", "Maria"
			},
			{
				"Vlad", "Luca"
			},
			{
				"Vlad", "Luca"
			},
			{
				"Vlad", "Luca"
			}
		};
		
		stampaMatrice(m);
		
		restituisceElemento(m, "Koko");

		restituisceElemento(m, "Vlad");
		
		restituisceElemento(m, in.readString("Inserisci il nome per cercare:"));
		
		restituisceConcatenazione(m);
		
		String[] nomiAppoggio = restituisceConcatenazione(m);
		
		for (String nome : nomiAppoggio) {
			out.writeln(nome);
		}	
		
	}
	
	public static void stampaMatrice (String[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				out.write(m[i][j] + "\t\t");
			}
			out.writeln("\n");
		}
	}
	
	public static boolean restituisceElemento (String[][] m, String nomeInput) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j].equalsIgnoreCase(nomeInput)) {
					out.writeln("Il nome inserito si trova nella cella di indice: " + i + " e " + j);
					return true;
				}
			}
		}
		out.writeln("Non abbiamo trovato il tuo elemento!");
		return false;
	}
	
	
	public static String[] restituisceConcatenazione (String m[][]) {
		String risulto = "";
		String[] stringheConcatenate = new String[4];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
					risulto = risulto.concat(m[i][j]);
					risulto += " ";
			}
			stringheConcatenate[i] += risulto;
			risulto = "";
		}
		return stringheConcatenate;
	}
	
	
}
	
	
	
































