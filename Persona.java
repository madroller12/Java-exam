package esercizijavetta;

public class Persona {
	private String nome;
	private String cognome;
	private int annonascita;
	private String codicefiscale;
	private int PINsegreto;

	
	
	public Persona(String nome, String cognome, int annonascita, String codicefiscale, int PINsegreto) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.annonascita = annonascita;
		this.codicefiscale = codicefiscale;
		this.PINsegreto = PINsegreto;
	}
	
	
	public String getNome() {
		return nome;
	}

	public int getPINsegreto() {
		return PINsegreto;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnnonascita() {
		return annonascita;
	}

	public void setAnnonascita(int annonascita) {
		this.annonascita = annonascita;
	}

	public String getCodicefiscale() {
		return codicefiscale;
	}

	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}	
	
	public void setPINsegreto(int PINsegreto) {
		this.PINsegreto = PINsegreto;
	}
	
	
}
