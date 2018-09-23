package com.vpp.chp20.ex3;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;;

@Configuration
@ComponentScan("com.vpp.chp20.ex3")
@EnableAspectJAutoProxy
@PropertySource(value= "classpath:connection.properties")
public class AppConfig {
	
	@Autowired
	public Environment env;

	@Bean
	public BasicDataSource createDataSource(){
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(env.getProperty("driverclassname"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("username"));
		ds.setPassword(env.getProperty("password"));
		return ds;
	}
	
	@Bean
	public JdbcTemplate createJdbcTemplate(DataSource ds){
		return new JdbcTemplate(ds);
	}
	
	@Bean
	public DataSourceTransactionManager createTxManager(DataSource ds){
		return new DataSourceTransactionManager(ds);
	}
}
