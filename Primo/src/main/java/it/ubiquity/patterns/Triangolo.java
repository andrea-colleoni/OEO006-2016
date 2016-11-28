package it.ubiquity.patterns;

public class Triangolo implements CalcoliFiguraPiana {
	
	private int base;
	private int altezza;
	
	public String getTipoTriangolo() {
		return "scaleno";
	}

	public int areaX(String messaggio) {
		return base * altezza / 2;
	}

	public int perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setLato(int lato) {
		// TODO Auto-generated method stub
		
	}

	public void setBase(int base) {
		this.base = base;
		
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

}
