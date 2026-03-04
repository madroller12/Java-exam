package g270126;

public class Persona {
	private String nome, cognome, codiceFiscale;
	private int datanascita, PINsegreto;

	public Persona(String nome, String cognome, String codiceFiscale, int datanascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.datanascita = datanascita;
	}

	public String getNome() {
		return nome;
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

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public int getDatanascita() {
		return datanascita;
	}

	public void setDatanascita(int datanascita) {
		this.datanascita = datanascita;
	}

	public void setPINsegreto(int pINsegreto) {
		PINsegreto = pINsegreto;
	}
	
	
	
}
