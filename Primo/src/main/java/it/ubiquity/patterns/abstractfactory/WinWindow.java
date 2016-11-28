package it.ubiquity.patterns.abstractfactory;

public class WinWindow extends AbstractResizableWindow {
	
	public WinWindow() {
		super();
		System.out.println("creata");
	}
	
	public void inizializza() {
		printMessage("inizializzazione finestra.....");
	}
	
	public WinWindow(int height, int width) {
		resize(height, width);
	}

	public void close() {
		// TODO Auto-generated method stub

	}

	public void open() {
		// TODO Auto-generated method stub

	}

	public void maximize() {
		// TODO Auto-generated method stub

	}

	public void iconize() {
		// TODO Auto-generated method stub

	}

	public void resize(int height, int width) {
		printMessage("finestra ridimensionata...");

	}

	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

	public void addButton(Button btn) {
		// TODO Auto-generated method stub

	}

}
