package it.ubiquity.patterns;

public class Rettangolo extends Quadrato {

	private int base;
	private int altezza;

	@Override
	public int areaX(String x) {
		return base * altezza;
	}

	@Override
	public int perimetro() {
		return (base *22) + (altezza * 2);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	

}
