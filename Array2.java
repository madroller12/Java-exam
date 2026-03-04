






//ci provo   :)

import fond.io.OutputWindow;
import fond.io.InputWindow;

public  class Array2 {
	
	static int[] array = {1,4,6,7,8,4,7,2,9,2};
	static InputWindow in = new InputWindow();
	static OutputWindow out = new OutputWindow();
	static int m=0;
	static int som=0;
	
	static void stampArray() {
		
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		out.writeln("_________________________");
		for(int i=0; i<array.length; i++) {
			
			out.writeln(array[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		//chiedere all'utente quanti numeri inserire per poi stamparli
		
		//out.write("Inserisci la grandezza dell'array: ");
		//int a = in.readInt();
		//out.writeln(a);
		
		/*for(int i=0; i<array.length; i++)    //popolarizzazione dell'array
		{
			out.write("Numero "+(i+1)+": ");
			
			int num = in.readInt();
			out.writeln(num);
			array[i] = num;
		}
		*/
		stampArray();
	
		sommaArray();
		
		mediaArray();
		
		cercaNumero();
		
	}
	
	static void sommaArray() {
		
		for(int i=0;i<array.length; i++) {
			
			som += array[i];
			
		}
		out.writeln("La somma degli elementi è: "+som);
			
		
	}
	
	
	static void mediaArray() {
		
		m=som/array.length;
		
		out.writeln("La media è: "+m);
		
	}	

	static void cercaNumero() {
		
		out.write("scegli un numero che si trova all'interno all'array: ");
		int sc= in.readInt();
		out.writeln(sc);
		int cont=0;
		
		
		for(int i=0; i<array.length;i++) {
			
			if(sc==array[i]) {
				
				cont+=1;
			}
		}
		out.write("il numero "+sc+" c'è per un totale di: "+cont);
		
	}
	
}
