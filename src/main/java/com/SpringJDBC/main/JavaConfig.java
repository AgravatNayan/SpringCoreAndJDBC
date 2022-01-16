package com.SpringJDBC.main;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.SpringJDBC.main")
public class JavaConfig {

	@Bean(name = { "ds" })
	public DataSource getdatasource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/world");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}

	@Bean(name = { "jdbcTemplate" })
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getdatasource());
		return jdbcTemplate;
	}

	// @Bean
	// public StudentDao studentImpl() {
	// StudentImpl studentdao = new StudentImpl();
	// studentdao.setJdbcTemplate(jdbcTemplate());
	// return studentdao;
	// }
}
