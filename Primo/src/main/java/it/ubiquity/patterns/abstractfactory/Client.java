package it.ubiquity.patterns.abstractfactory;

public class Client {
	
	private AbstractUIFactory factory;
	private ResizableWindow win200;

	public Client() {
		super();
		System.out.println("creato client");
	}

	public void go() {
		//AbstractUIFactory factory = null;
		win200.resize(100, 100);
		
		Window w1 = factory.createWindow();
		w1.maximize();
		Window w2 = factory.createWindow();
		w2.iconize();
		ResizableWindow w3 = (ResizableWindow)factory.createWindow();
		w3.resize(300, 300);
		
		Button btn = factory.createButton();
		w1.addButton(btn);
		btn = factory.createButton();
		w1.addButton(btn);
		btn.click();
		
		btn = factory.createButton();
		w2.addButton(btn);
		btn = factory.createButton();
		w2.addButton(btn);
		btn.dblClick();
		
		btn = factory.createButton();
		w3.addButton(btn);
		btn = factory.createButton();
		w3.addButton(btn);
	}

	public void setFactory(AbstractUIFactory factory) {
		System.out.println("impostata factory");
		this.factory = factory;
	}

	public void setWin200(ResizableWindow win200) {
		this.win200 = win200;
	}

}
