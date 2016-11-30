package it.ubiquity.spring.gg3aspectj;

import org.springframework.stereotype.Component;

@Component
public class AdvisedClass {

	public void doSomething() {
		System.out.println("dentro al metodo doSomething");
	}
	
	public void deleteSomething() {
		System.out.println("dentro al metodo deleteSomething");
	}
	
	public void updateSomething() {
		System.out.println("dentro al metodo updateSomething");
	}
}
