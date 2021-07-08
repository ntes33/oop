package it.univpm.EsameCalcioLuglio.Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;



public class GetCompetition {
	public  JSONObject getJSON(String id) throws IOException {
		JSONObject json=new JSONObject();
	 URL url = new URL("http://api.football-data.org/v2/competitions/2019");
	
    HttpURLConnection  conn = (HttpURLConnection)url.openConnection();
     conn.setRequestMethod("GET");
     conn.setRequestProperty("Authorization", "Bearer c59e26957408404d90d505ab38373d18");
     conn.setRequestProperty("X-Auth-Token" , "c59e26957408404d90d505ab38373d18");
     conn.addRequestProperty("User-Agent",	"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
     conn.setDoOutput(true);
     conn.connect();
     int responsecode = conn.getResponseCode();
     System.out.println(responsecode);
     if(responsecode != 200)
    	 throw new RuntimeException("HttpResponseCode: "+ responsecode);
     else {
    	 BufferedReader br = null;
    	 br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    	 String strCurrentLine;
         while ((strCurrentLine = br.readLine()) != null) {
                System.out.println(strCurrentLine);
         }
	
return json ;
     }
	}
     }

