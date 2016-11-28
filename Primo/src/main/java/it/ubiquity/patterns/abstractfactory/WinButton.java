package it.ubiquity.patterns.abstractfactory;

public class WinButton implements Button {
	
	public WinButton() {
		super();
		System.out.println("creato bottone windows");
	}

	public void click() {
		System.out.println("cliccato bottone windows");

	}

	public void dblClick() {
		System.out.println("doppio click bottone windows");

	}

}
