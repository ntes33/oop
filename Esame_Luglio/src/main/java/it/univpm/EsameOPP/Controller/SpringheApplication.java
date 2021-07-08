package it.univpm.EsameOPP.Controller;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;

import it.univpm.EsameOPP.Utility.test;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
public class SpringheApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringheApplication.class, args);
		test.getJSON();
	}
	

	
}
