package PacchettoSus;

import fond.io.InputWindow;
import fond.io.OutputWindow;

public class EsecuzioneCalcolatrice {

	public static void main(String[] args) {
		
		
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		

        out.writeln("Inserisci il primo numero:");
        double n1 = in.readDouble();

        out.writeln("Inserisci il secondo numero:");
        double n2 = in.readDouble();
        
        
		out.writeln("1) Somma");
		out.writeln("2) Sottrazione");
		out.writeln("3) Moltiplicazione");
		out.writeln("4) Divisione");
		out.writeln("5) Esci");

		
        out.writeln("Selezionare un'operazione");
        int x = in.readInt();

			
            
        Calcolatrice c = new Calcolatrice(n1, n2, x);
            
            switch (x) {
            case 1:
            	out.writeln("La somma dei due numeri è pari a: " + c.Somma());
            	break;
            case 2:
            	out.writeln("La differenza dei due numeri è pari a: " + c.Sottrazione());
            	break;
            case 3:
            	out.writeln("Il prodotto dei due numeri è pari a:  " + c.Moltiplicazione());
            	break;
            case 4:
            	if(c.Divisione()==0)out.writeln("Impossibile dividere per 0");
            	else
            	out.writeln("Il quoziente dei due numeri è pari a: " + c.Divisione());
            	break;
            case 5:
            	out.writeln("Uscita dal programma in corso...");
            	break;
            default:
            	out.writeln("Operazione non disponibile");
        }
           
	}	
				
}


