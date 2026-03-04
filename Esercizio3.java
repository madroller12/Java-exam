
import java.io.*;
import fond.io.*;

public class Esercizio3 {
	public static void main(String[] args) throws IOException {
		InputWindow in = new InputWindow();
		OutputWindow out = new OutputWindow();
		
		float a = in.readFloat();
		float b = in.readFloat();
		float c = 0;
		
		for (int i = 0; i < 5; i++) {
			c += a * b;
			out.writeln(c);
		}
		
		
		
		
	}

}
