
public class Automobile {
	private int velocita = 0, marcia = 0, nPosti = 0, vMax = 0, maxMarcia = 0;
	private boolean status = false, OnOff = false;
	private String marca, modello, colore, nTelaio, targa, carburante; // targa через 'a'
	
	public Automobile(int velocita, int marcia, int nPosti, int vMax, int maxMarcia, boolean status, boolean onOff, String marca,
			String modello, String colore, String nTelaio, String targa, String carburante) {
		super();
		this.velocita = velocita;
		this.marcia = marcia;
		this.nPosti = nPosti;
		this.vMax = vMax;
		this.status = status;
		this.OnOff = onOff;
		this.marca = marca;
		this.modello = modello;
		this.colore = colore;
		this.nTelaio = nTelaio;
		this.targa = targa;
		this.carburante = carburante;
		this.maxMarcia = maxMarcia;
	}

	public void impostaMarcia() {
		if(this.)
	}
	
	public int getMaxMarcia() {
		return maxMarcia;
	}



	public void setMaxMarcia(int maxMarcia) {
		this.maxMarcia = maxMarcia;
	}



	public int getvMax() {
		return vMax;
	}


	public void setvMax(int vMax) {
		this.vMax = vMax;
	}


	public boolean isOnOff() {
		return OnOff;
	}


	public void setOnOff(boolean onOff) {
		OnOff = onOff;
	}


	public int getVelocita() {
		return velocita;
	}

	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}

	public int getMarcia() {
		return marcia;
	}

	public void setMarcia(int marcia) {
		this.marcia = marcia;
	}

	public int getnPosti() {
		return nPosti;
	}

	public void setnPosti(int nPosti) {
		this.nPosti = nPosti;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getnTelaio() {
		return nTelaio;
	}

	public void setnTelaio(String nTelaio) {
		this.nTelaio = nTelaio;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getCarburante() {
		return carburante;
	}

	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
	// Додайте це, щоб виводити інфо про авто одним рядком:
	public String info() {
		return "Auto: " + marca + " " + modello + " | Vel: " + velocita + " km/h | Motore: " + (OnOff ? "ON" : "OFF");
	}
	
	
	
	
	
}
