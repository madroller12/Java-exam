
import java.io.*;
import java.util.Scanner;
import fond.io.*;

public class Esercizio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		/*System.out.println("Hello world!");
		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
		
		String input = tastiera.readLine();
		
		int convertito = Integer.parseInt(input);
		
		System.out.println(input + " caro!");*/
		
		/*System.out.println("Inserisci una parola");
		
		Scanner tastiera = new Scanner(System.in);
		
		String nome = tastiera.nextLine();
		
		System.out.println(nome);
		
		//nome.charAt(0); Recupero dalla posizione 0 il carattere scritto sulla tastiera
		
		char c = nome.charAt(0);
		
		System.out.println(c);*/
		
		InputWindow in = new InputWindow();
        OutputWindow out = new OutputWindow();
        
        int a = in.readInt();
        out.writeln(a);
	}

}
