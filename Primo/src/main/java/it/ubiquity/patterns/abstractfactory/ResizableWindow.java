package it.ubiquity.patterns.abstractfactory;

public interface ResizableWindow extends Window {

	void resize(int height, int width);
	
	void setWidth(int width);
	void setHeight(int height);
}
