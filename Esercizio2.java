import fond.io.*;


public class Esercizio2 {
	public static void main (String[]args) {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		/*out.write("Inserisci il primo valore: ");
		double n1 = in.readInt();
		out.writeln(n1);
		out.write("Inserisci il secondo valore: ");	
		double n2 = in.readInt();
		out.writeln(n2);
		double somma = n1 + n2;
		out.writeln("la somma è: " + somma);
		double sottrazione = n1 - n2;
		out.writeln("la sottrazione è: " + sottrazione);
		double divisione = n1 / n2;
		out.writeln("la divisione è: " + divisione);
		double moltiplicazione = n1 * n2;
		out.writeln("la moltiplicazione è: " + moltiplicazione);
		double resto = n1 % n2;
		out.writeln("il resto è: " + resto);
		
		//numero pari o dispari 
		
		out.write("inserisci il numero per verificare se è pari o dispari : " ); 
		double n = in.readInt();
		out.writeln(n);
		double resto1 = n % 2;
		if (resto1 == 0)
			out.writeln("il numero è pari ");
		else 
			out.writeln("il numero è dispari");
		
		//numero positivo negativo nullo
		
		out.write("inserisci il numero ");
		double n = in.readDouble();
		out.writeln(n);
		if (n > 0)
			out.writeln("il numero è positivo");
		else if  (n < 0 )
			out.writeln("il numero è negativo");
		else
			out.writeln("il numero è nullo");
		
		//maggiore tra due numeri
		
		out.write("Inserisci il primo valore: ");
		double n1 = in.readDouble();
		out.writeln(n1);
		out.write("Inserisci il secondo valore: ");	
		double n2 = in.readDouble();
		out.writeln(n2);
		if (n1 > n2 ) {
			out.write("il maggiore è : ");
			out.writeln(n1);
		} else 
			out.writeln("il maggiore è : " + n2);
		
		// Dato un numero qualsiasi stampa la tabellina 	
		
		out.writeln("inserisci un numero da 1 a 10: ");
		int n1 = in.readInt();
		
		out.writeln("la tabellina del numero" + n1 + "che ho inserito è : ");
		if(n1<=10) {
			out.writeln(n1 * 1);
			out.writeln(n1 * 2);
			out.writeln(n1 * 3);
			out.writeln(n1 * 4);
			out.writeln(n1 * 5);
			out.writeln(n1 * 6);
			out.writeln(n1 * 7);
			out.writeln(n1 * 8);
			out.writeln(n1 * 9);
			out.writeln(n1 * 10);
		
			
		} else 
			out.writeln("il numero inserito è sbagliato");*/
		out.writeln("inserisci un numero da 1 a 10: ");
		int n1 = in.readInt();
		
		out.writeln("la tabellina del numero" + n1 + "che ho inserito è : ");
		
		if(n1<=10) {
		for (int i = 1; i <= 10 ; i++) {
			out.writeln(n1 * i);
			
		}//inizializzazione; condizione; incremento; 
		
		}else 
			out.writeln("il numero inserito è sbagliato");
		
	}
	
	
}