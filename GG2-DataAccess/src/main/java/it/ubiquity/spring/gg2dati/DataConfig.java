package it.ubiquity.spring.gg2dati;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataConfig {
	
	@Bean
	@Scope("singleton")
	public Client client() {
		Client cl = new Client();
		cl.setPersonaDao(personaDao());
		return cl;
	}	

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://192.168.5.153:3307/ubiquity?useSSL=false");
		ds.setUsername("ubiquity");
		ds.setPassword("password");
		return ds;
	}
	
	@Bean
	@Scope("singleton")
	public PersonaDao personaDao() {
		PersonaDao pd = new PersonaDao();
		pd.setDataSource(dataSource());
		return pd;
	}
	

}
