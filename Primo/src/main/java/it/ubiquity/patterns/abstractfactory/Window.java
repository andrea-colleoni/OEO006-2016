package it.ubiquity.patterns.abstractfactory;

public interface Window {

	void close();
	void open();
	void maximize();
	void iconize();
	void move(int x, int y);
	
	void addButton(Button btn);
	
	void setNome(String nome);
	void printMessage(String message);

}
