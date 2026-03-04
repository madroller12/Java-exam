package tecniche_programmazione;

public class Automobile {
	private int velocita = 0;
	private boolean onOff = false;
	private int marcia = 0;
	private String marca = "";
	private String modello = "";
	private String colore = "";
	private String nTelaio = "";
	private String targa = "";
	private int nPosti = 0;
	private String carburante = "";
	private int maxMarcia = 0;
	private double qCarburanteMax = 0;
	private double qCarburante = 0;
	private double tachimetro = 0;
	
	private int vMax = 0;
	
	public Automobile(int velocita, boolean status, int marcia, String marca, String modello, String colore,
			String nTelaio, String targa, int nPosti, String carburante, int vMax, int maxMarcia, double qCarburanteMax, double qCarburante) {
		this.velocita = velocita;
		this.onOff = status;
		this.marcia = marcia;
		this.marca = marca;
		this.modello = modello;
		this.colore = colore;
		this.nTelaio = nTelaio;
		this.targa = targa;
		this.nPosti = nPosti;
		this.carburante = carburante;
		this.vMax = vMax;
		this.maxMarcia = maxMarcia;
		this.qCarburanteMax = qCarburanteMax;
		this.qCarburante = qCarburante;
	}
	
	
	
	public double getTachimetro() {
		return tachimetro;
	}



	public void setTachimetro(double tachimetro) {
		this.tachimetro += tachimetro;
	}



	public String calcConsumo(double km) {
		// 1 l per 15km
		
		double consumo = km/15;
		
		if(this.getqCarburante() == 0) {
			return "Prima di effettuare un tragitto, rifornisciti!";
		}
		
		if(this.getqCarburante() - consumo < 0) {
			double c = (this.getqCarburante() * 15 - km)*-1;
			setTachimetro(c);
			return "Dovrai fermarti durante il tragitto per rifornirti entro il Km " + c;
		} else {
			//this.getqCarburante() - consumo
			double l = Math.round((this.getqCarburante() - consumo) * 100.0) / 100.0;
			this.setqCarburante(l);
			System.out.println(this.getqCarburante() - consumo);
			setTachimetro(km);
			return "Hai raggiunto la meta!\nIl tachimetro conta " + getTachimetro() +
					" Km\nHai a disposizione " + getqCarburante() + " di " +
					getCarburante();
		}
		
		
		
	}
	
	public double getqCarburante() {
		return this.qCarburante;
	}
	
	public void setqCarburante(double qCarburante) {
		this.qCarburante = qCarburante;
	}

	public void impostaMarcia() {
		if(this.getVelocita() >= 0 && this.getVelocita() <= 20) this.setMarcia(1);
		if(this.getVelocita() >= 21 && this.getVelocita() <= 39) this.setMarcia(2);
		if(this.getVelocita() >= 40 && this.getVelocita() <= 59) this.setMarcia(3);
		if(this.getVelocita() >= 60 && this.getVelocita() <= 79) this.setMarcia(4);
		if(this.getVelocita() >= 80 && this.getVelocita() <= 99) this.setMarcia(5);
		if(this.getVelocita() >= 100 && this.getVelocita() <= this.getVMax()) this.setMarcia(6);
	}
	
	public double getqCarburanteMax() {
		return qCarburanteMax;
	}


	public int getVMax() {
		return vMax;
	}
	
	public void setVMax(int vMax) {
		this.vMax = vMax;
	}
	
	public int getMaxMarcia() {
		return maxMarcia;
	}
	
	public boolean getOnOff() {
		return this.onOff;
	}
	
	public void setOnOff(boolean onOff) {
		this.onOff = onOff; 
	}

	public int getVelocita() {
		return velocita;
	}

	public int getMarcia() {
		return marcia;
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public String getColore() {
		return colore;
	}

	public String getnTelaio() {
		return nTelaio;
	}

	public String getTarga() {
		return targa;
	}

	public int getnPosti() {
		return nPosti;
	}

	public String getCarburante() {
		return carburante;
	}

	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}

	public void setMarcia(int marcia) {
		this.marcia = marcia;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public void setnPosti(int nPosti) {
		this.nPosti = nPosti;
	}

	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
}
