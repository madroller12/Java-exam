package g270126;

public class ContoCorrente {
	private int saldo;
	private String IBAN;
	private Persona p1;
	private Persona p2;
	public ContoCorrente(String IBAN, Persona p1, Persona p2) {
		super();
		this.saldo = 0;
		this.IBAN = IBAN;
		this.p1 = p1;
		this.p2 = p2;
	}
	public ContoCorrente(String IBAN, Persona p1) {
		super();
		this.saldo = 0;
		this.IBAN = IBAN;
		this.p1 = p1;
	}
	
	

}
