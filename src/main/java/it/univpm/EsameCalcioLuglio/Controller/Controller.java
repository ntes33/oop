package it.univpm.EsameCalcioLuglio.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sun.xml.messaging.saaj.packaging.mime.internet.ParseException;

import it.univpm.EsameCalcioLuglio.Utilities.GetCompetition;

/**
 * Classe che gestisce le richieste GET.
 */
@RestController 
public class Controller {
/*	@RequestMapping(path="competition/{id}", method= {RequestMethod.GET}, headers="Accept=application/json; charset=utf-8" )
	public JSONObject GetCompetition remove(@PathVariable("id")int id) throws FileNotFoundException, IOException
	{
		GetCompetition test = new GetCompetition();
		test.getJSON(id);
	
		return json;  */
	@RequestMapping(path = "/competition/{id}", method = RequestMethod.GET, headers = "Accept=application/json; charset=utf-8")
	public JSONObject GetCompetition(@PathVariable("id") String id)
	throws FileNotFoundException, IOException, ParseException // stampa tutti i dati del dataset in formato json
	{
		id = "2019";
		GetCompetition test = new GetCompetition();
		
		return test.getJSON(id);
	
		


	
	

	
		

	

	}
}
