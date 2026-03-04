package g270126;
import fond.io.InputWindow;
import fond.io.OutputWindow;


public class es4 {
	public static void main(String[] args) {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		//Persona p1 = new Persona(in.readString("Nome:"),
		//		in.readString("Cognome:"), in.readString("CF:"), in.readInt("Data di nascita:"));
		Persona p1 = new Persona("Federico", "Fiore", "FDFRGKC73893PK", 01010001);
		Persona p2 = new Persona("Vlad", "Blonskyi", "BFNDJ6475JHBJ4", 12012007);
		Persona p3 = new Persona("Pipi", "Kaka", "PIKPKIKP34739PKI", 99999999);
		
		ContoCorrente cc1 = new ContoCorrente("IBANFJDKEN35IT", p1, p2);
		ContoCorrente cc2 = new ContoCorrente("IBANFJDIJDVJDIT", p1);
		ContoCorrente cc3 = new ContoCorrente("IBANCKNDVDPNIT", p3, p2);
		
		int pin = in.readInt("Inserisci il tuo nuovo PIN:");
		
		
		
		
	}

}
