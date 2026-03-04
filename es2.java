package g270126;
import fond.io.InputWindow;
import fond.io.OutputWindow;
import java.util.Vector;
import java.util.random.RandomGenerator;
import java.util.Random;

public class es2 {
	static InputWindow in = new InputWindow();
	static OutputWindow out = new OutputWindow();
	
	public static void stampaMatrice(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				out.write(m[i][j]);
			}
			out.writeln();
		}
	}
	
	public static void stampaMatriceTab(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				out.write("\t" + m[i][j]);
			}
			out.writeln();
		}
	}
	
	public static void main(String[] args) {
		
		
		int r = in.readInt("Inserisci il numero delle righe:");
		int c = in.readInt("Inserisci il numero dell colonne:");
		
		out.writeln("La matrice è lunga nRighe " + r + " le colonne sono " + c);
		int[][] matrice = new int[r][c];
		
		Random R = new Random();
		
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				
				matrice[i][j] = R.nextInt(1, 9);
			}
		}
		
		stampaMatriceTab(matrice);
		
	}
	
	

}
