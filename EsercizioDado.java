import fond.io.InputWindow;
import fond.io.OutputWindow;

public class EsercizioDado {

	public static void main(String[] args) {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		Persona_class p1 = new Persona_class("Mat", "Macchia", "MTTMCC", 24, 'M');
		Persona_class p2 = new Persona_class("Leo", "Fax", "LEOFAX", 22, 'M');
		
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		Dado d3 = new Dado();
		Dado d4 = new Dado();
		Dado d5 = new Dado();
		Dado d6 = new Dado();
		
		int l1 = d1.lancioDado();
		int l2 = d2.lancioDado();
		int l3 = d3.lancioDado();
		int l4 = d4.lancioDado();
		int l5 = d5.lancioDado();
		int l6 = d6.lancioDado();
		
		int[] lanci = new int[6];
		lanci[0] = l1;
		lanci[1] = l2;
		lanci[2] = l3;
		lanci[3] = l4;
		lanci[4] = l5;
		lanci[5] = l6;
		
		out.writeln("I dadi lanciati hanno dato " + lanci[0] + " " + lanci[1] + " " + lanci[2] + " " + lanci[3] + " " + lanci[4] + " " + lanci[5]);
		for (int i = 0; i < 6; i++) {
			if 
		}
		
	}

}
