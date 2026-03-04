import java.io.*;
import java.util.Scanner;
import fond.io.*;


public class Esercizio1 {

	public static void main(String[] args) throws IOException {

		/*System.out.println("Inserisci un numero ");
		
		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
		
		String input = tastiera.readLine();
		
		int convertito = Integer.parseInt(input);
		
		System.out.println(convertito);
		
		System.out.println(input);
		
		convertito = tastiera.read();//restituisce l'intero ascii
		
		System.out.println(convertito);*/

		
		/*System.out.println("inserisci una parola");
		
		Scanner tastiera = new Scanner(System.in);
		
		String nome = tastiera.nextLine();
		
		System.out.println(nome);
		
		//Recupero dalla posizione 0 il carattere scritto sulla tastiera 
		
		char carattere = nome.charAt(0);
		
		char carattere1 = nome.charAt(1);

		char carattere2 = nome.charAt(2);

		char carattere3 = nome.charAt(3);

		System.out.println(carattere+" "+carattere1+" "+carattere2+" "+carattere3);*/
		
		
		/*Scanner tastiera = new Scanner(System.in);
		
		int valore = tastiera.nextInt();

		System.out.println("il numero inserito e' " + valore);*/
		
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		int numero1 = in.readInt();
		out.writeln(numero1);
	}

}
