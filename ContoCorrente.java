package esercizijavetta;
import fond.io.*;

public class ContoCorrente {

	private static int saldo = 0;
	private String IBAN;
	private Persona p1;
	private Persona p2;

	public ContoCorrente(String IBAN, Persona p1, Persona p2) {
		this.IBAN = IBAN;
		this.p1 = p1;
		this.p2 = p2;
	}
	public ContoCorrente(String IBAN, Persona p1) {
		this.IBAN = IBAN;
		this.p1 = p1;
	}
	
	public int getSaldo() {
		return saldo;
	}

	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String IBAN) {
		this.IBAN = IBAN;
	}
	public Persona getP1() {
		return p1;
	}
	public void setP1(Persona p1) {
		this.p1 = p1;
	}
	public Persona getP2() {
		return p2;
	}
	public void setP2(Persona p2) {
		this.p2 = p2;
	}

	static public void preleva(int quantita) {
		if (saldo - quantita >= 0) {
			saldo -= quantita;
		}
	}
	
	static public void deposita(int quantita) {
			saldo += quantita;
	}
	
	static public int stampasaldo() {
		return saldo;
	}
}
