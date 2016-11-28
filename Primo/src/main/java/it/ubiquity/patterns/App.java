package it.ubiquity.patterns;

public class App {
	
	enum TipoFigura {
		TRIANGOLO,
		QUADRATO,
		RETTANGOLO
	}
	
	static CalcoliFiguraPiana createFiguraPiana(TipoFigura tipoFigura) {
		switch(tipoFigura) {
		case QUADRATO:
			return new Quadrato();
		case RETTANGOLO:
			return new Rettangolo();
		case TRIANGOLO:
			return new Triangolo();
		}
		return null;
	}
	

	public static void main(String[] args) {
		CalcoliFiguraPiana r = createFiguraPiana(TipoFigura.RETTANGOLO);
		r.setBase(10);
		r.setAltezza(20);
		Utility.stampaMessaggi(r);
		
		CalcoliFiguraPiana q = createFiguraPiana(TipoFigura.QUADRATO);
		q.setLato(120);
		Utility.stampaMessaggi(q);
		
		CalcoliFiguraPiana t = createFiguraPiana(TipoFigura.TRIANGOLO);
		((Triangolo)t).getTipoTriangolo();
		Utility.stampaMessaggi(t);
	}

}
