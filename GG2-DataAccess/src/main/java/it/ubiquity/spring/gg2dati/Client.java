package it.ubiquity.spring.gg2dati;

import java.util.List;

public class Client {

	PersonaDao personaDao;
	
	public Client() {
		super();
	}

	public void stampaElencoPersone() {
		List<Persona> persone = personaDao.all();
		for(Persona p: persone) {
			System.out.println(p.getNome());
		}
	}

	public void setPersonaDao(PersonaDao personaDao) {
		this.personaDao = personaDao;
	}
}
