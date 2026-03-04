import fond.io.InputWindow;
import fond.io.OutputWindow;
public class EsercizioPersona {

	public static void main(String[] args) {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		Persona_class p1 = new Persona_class("Mat", "Macchia", "MTTMCC", 24, 'M');
		Persona_class p2 = new Persona_class("Leo", "Fax", "LEOFAX", 22, 'M');
		
		String nome = p2.getNome();
		out.writeln(nome);
		p1.setEtà(21);
		out.writeln(p1.getEtà());
	}

}
