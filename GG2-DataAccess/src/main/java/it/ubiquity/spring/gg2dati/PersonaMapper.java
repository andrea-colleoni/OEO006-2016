package it.ubiquity.spring.gg2dati;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonaMapper implements RowMapper<Persona> {

	public Persona mapRow(ResultSet rs, int arg1) throws SQLException {
		Persona p = new Persona();
		p.setNome(rs.getString("nome"));
		p.setCognome(rs.getString("cognome"));
		p.setAltezza(rs.getFloat("altezza"));
		p.setId(rs.getInt("id"));
		return p;
	}
}
