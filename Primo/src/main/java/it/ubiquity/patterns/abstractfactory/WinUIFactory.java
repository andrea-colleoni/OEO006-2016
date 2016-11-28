package it.ubiquity.patterns.abstractfactory;

public class WinUIFactory implements AbstractUIFactory {
	
	public WinUIFactory() {
		super();
		System.out.println("creata factory windows");
	}

	public Window createWindow() {
		Window w = new WinWindow();
		w.setNome("DA FACTORY");
		return w;
	}

	public Button createButton() {
		return new WinButton();
	}

}
