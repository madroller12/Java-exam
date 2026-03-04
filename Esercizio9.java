import fond.io.InputWindow;
import fond.io.OutputWindow;
 
public class Esercizio9 {
 
	public static void main(String[] args) {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();

		out.writeln("Inserisci la lunghezza del lato 1");
		int lato1 = in.readInt();
		out.writeln(lato1);

		out.writeln("Inserisci la lunghezza del lato 2");
		int lato2 = in.readInt();
		out.writeln(lato2);

		out.writeln("Inserisci la lunghezza del lato 3");
		int lato3 = in.readInt();
		out.writeln(lato3);
		

//      Classe | Oggetto  | Costruttore | Eventuali parametri ()
		Triangolo t1 = new Triangolo(lato1,lato2,lato3);

		double semiP = t1.perimetro() / 2;
		
		
		out.writeln("Il trinagolo è: " + t1.determinazione_Triangolo());
		out.writeln("Il perimetro del triangolo è: " + t1.perimetro());
		out.writeln("L'area del triangolo è: " + t1.area());
		out.writeln("L'area del triangolo è: " + t1.area(semiP));

 
	}

}
 