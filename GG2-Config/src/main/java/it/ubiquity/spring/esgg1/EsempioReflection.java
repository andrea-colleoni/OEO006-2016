package it.ubiquity.spring.esgg1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EsempioReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		String nomeClasse = "org.springframework.jdbc.datasource.DriverManagerDataSource";

		Class<?> c = Class.forName(nomeClasse);
		Object dataSource = c.newInstance();

		String nomeMetodo = "pippo";
		Method x = dataSource.getClass().getMethod(nomeMetodo);
		if (x != null) {
			x.invoke(dataSource);
		}
		
		Method[] methods = Messaggio.class.getMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
		}
	}
}
