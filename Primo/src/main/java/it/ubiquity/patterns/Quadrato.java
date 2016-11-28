package it.ubiquity.patterns;

public class Quadrato implements CalcoliFiguraPiana {
	
	private int lato;
	
	public int areaX(String k) {
		return lato + lato;
	}
	
	public int perimetro() {
		return lato * 4;
	}
	
	public int getLato() {
		return lato;
	}

	public void setLato(int lato) {
		this.lato = lato;
	}

	public void setBase(int base) {
		
	}

	public void setAltezza(int altezza) {
	}
	

}
