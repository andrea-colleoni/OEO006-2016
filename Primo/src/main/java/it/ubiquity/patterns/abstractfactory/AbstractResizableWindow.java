package it.ubiquity.patterns.abstractfactory;

public abstract class AbstractResizableWindow implements ResizableWindow {
	
	private int width;
	private int height;
	private String nome;
	
	
	
	public void setWidth(int width) {
		this.width = width;
		resize(width, width);
	}

	public void setHeight(int height) {
		this.height = height;
		resize(height, height);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void printMessage(String message) {
		System.out.println(nome + ": " + message);
	}	

}
