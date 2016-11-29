package it.ubiquity.spring.gg2dati;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonaDao {
		
	private JdbcTemplate jdbcTemplate;
	
	public PersonaDao() {
		super();
	}

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insert(Persona p) {
		// insert nel db
		// apro cnx
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql:///192.168./ubiquity", "ubiquity", "password");
//		Statement st = conn.createStatement();
		// eseguo SQL
		//jdbcTemplate ...
		
		// chiudo cnx
//		rs.close();
//		st.close();
//		conn.close();
	}
	
	public void update(Persona p) {
		// update
	}

	public void delete(Persona p) {
		
	}
	
	public Persona byKey(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM persona WHERE id=" + id, new PersonaMapper());
	}
	
	public List<Persona> all() {
		return jdbcTemplate.query("SELECT * FROM persona", new PersonaMapper());
	}
}
