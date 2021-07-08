package it.univpm.EsameCalcioLuglio;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.univpm.EsameCalcioLuglio.Utilities.GetCompetition;

@SpringBootApplication
public class EsameCalcioLuglioApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(EsameCalcioLuglioApplication.class, args);
	
	
	}
}


