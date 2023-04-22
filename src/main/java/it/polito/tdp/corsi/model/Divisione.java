package it.polito.tdp.corsi.model;

public class Divisione {
	
	private String CDS;
	private int nStudenti;
	
	public Divisione(String cDS, int nStudenti) {
		super();
		CDS = cDS;
		this.nStudenti = nStudenti;
	}
	public String getCDS() {
		return CDS;
	}
	public void setCDS(String cDS) {
		CDS = cDS;
	}
	public int getnStudenti() {
		return nStudenti;
	}
	public void setnStudenti(int nStudenti) {
		this.nStudenti = nStudenti;
	}
	@Override
	public String toString() {
		return "Divisione [CDS=" + CDS + ", nStudenti=" + nStudenti + "]";
	}
	
	

}
