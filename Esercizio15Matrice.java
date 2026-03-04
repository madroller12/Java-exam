import fond.io.InputWindow;
import fond.io.OutputWindow;
import java.util.Random;

public class Esercizio15Matrice {

	static InputWindow in= new InputWindow();
	static OutputWindow out= new OutputWindow();
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		
		out.writeln("Inserisci il numero delle righe");
		int r = in.readInt();
		
		out.writeln("Inserisci il numero delle colonne");
		int c = in.readInt();

		out.writeln("La matrice è lunga nRighe " + r + " le colonne sono " + c);

		int [][] m = new int[r][c];
		
		inizializzaMatrice(m);
		
		//stampaMatrice(m);
		
		//stampaMatriceTab(m);
		
		riempiMatrice(m);
		
		//out.writeln("\nLa somma è " + sommaMatriceTOT(m));
		
		out.writeln("\n");
		
		sommaRigaMatrice(m);
		
		out.writeln("\n");

		sommaColonnaMatrice(m);
		
		out.writeln("\n");

		sommaDiagonaleMatrice(m, r, c);
		
		out.writeln("\nIl numero maggiore è "+numMaggioreMatrice(m));

		
	}
	
	// Inizializzazione matrice con tutti i valoria 0
	static public void inizializzaMatrice(int m[][]) {
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++)
				m[i][j] = 0;
		}
	}
	
	// Stamapa matrice estesa 
	static public void stampaMatrice(int m[][]) {
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {
				out.writeln("Nella riga numero "+(i+1)+ " nella colonna numero "+(j+1)+" c'è l'elemento :" + m[i][j]);
			}
		}
	}
	
	// Stampa matrice a tabbella 
	static public void stampaMatriceTab(int m[][]) {
		for(int i = 0; i<m.length; i++) {
			out.writeln();
			for(int j = 0; j<m[i].length; j++) {
				out.write("\t"+m[i][j]);
			}
		}
	}
	
	// Riempe la matrice con valori random da 1 a 100
	static public void riempiMatrice(int m[][]) {
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {
				m[i][j] = random.nextInt(1, 100);
			}		
		}
		stampaMatriceTab(m);
	}
	
	// Somma di tutti i valori della matrice 
	static public int sommaMatriceTOT(int m[][]) {
		int somma = 0;
		
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {
				//somma+=m[i][j];
				if(m[i][j]%2 == 0)
					somma+=m[i][j];
			}		
		}
		return somma;
	}
	
	
	static public void sommaRigaMatrice(int m[][]) {
		int somma = 0;
		
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {
				out.write("\t"+m[i][j]);
				somma+=m[i][j];
			}
			if (somma != 0) {
				out.writeln("	La somma della riga " + (i+1) + " è " + somma );
				somma = 0;
			}
		}
	}
	
	
	static public void sommaColonnaMatrice(int m[][]) {
		int somma = 0;
		
		for(int i = 0; i<m[0].length; i++) {
			for(int j = 0; j<m.length; j++) {
				out.write("\t"+m[j][i]);
				somma+=m[j][i];
			}
			if (somma != 0) {
				out.writeln("	La somma della colonna " + (i+1) + " è " + somma );
				somma = 0;
			}
		}
	}
	
	static public void sommaDiagonaleMatrice(int m[][], int r, int c) {
		int somma = 0;
		
		if(c != r) {
			out.writeln("La matrice non è quadrata ");
		}else {
			for(int i = 0; i<m.length; i++) {
				for(int j = 0; j<m[i].length; j++) {
					if(i==j) {
						somma+=m[i][j];
					}
				}		
			}
			out.writeln("La somma della diagonale è " + somma );
		}
	}
	
	static public int numMaggioreMatrice(int m[][]) {
		
		int maggiore = m[0][0];
		
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {
				if(m[i][j]>maggiore) {
						maggiore = m[i][j];
					}
				}
			}
		return maggiore;
	}
}
