import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import fond.io.*;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class leggi_da_file {

	public static void main(String[] args) {
		
		// per l'output
		OutputWindow out = new OutputWindow();
		
		// inizializzo un array dinamico
		List<Integer> array = new ArrayList<Integer>();
		
		// inizializzo una variabile per la gestione del file
		File file = new File("./numeri.txt");
		// dichiaro una variabile per leggere dal file e la metto a null per il momento
		BufferedReader buffer = null;
		
		try {
			// assegno a buffer il file
			buffer = new BufferedReader(new FileReader(file));
			// e creo una variabile stringa e la metto a null
			String text = null;
			
			// finche text prende il valore della riga corrente e questo valore non è nullo ciclo
			// cioè ciclo finche non raggiungo EOF (End Of File)
			while((text = buffer.readLine()) != null) {
				// aggiungo il valore all'array
				array.add(Integer.valueOf(text));
			}
		// catch di ogni pollibile exception
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// se riesce a leggere ogni riga tento di chiudere il file se non avviene un exception
			try {
				if (buffer != null) {
					buffer.close();
		        }
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		} 
		
		// printo tutti i valori a schermo
		for(int i = 0; i < array.size(); i++) {
			out.write(array.get(i));
		}

	}

}
