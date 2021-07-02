package it.univpm.EsameOPP.Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.apache.tomcat.util.json.JSONParser;
import org.codehaus.jettison.json.JSONObject;

public class test {
	public static JSONObject getJSON() throws IOException {
		JSONObject json=new JSONObject();
	 URL url = new URL("http://api.football-data.org/v2/competitions");
	
     HttpURLConnection conn = (HttpURLConnection)url.openConnection();
     conn.setRequestMethod("GET");
     conn.setRequestProperty("Authorization", "Bearer c59e26957408404d90d505ab38373d18");
     conn.setRequestProperty("X-Auth-Token" , "c59e26957408404d90d505ab38373d18");
     //conn.addRequestProperty("User-Agent",	"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
     conn.setDoOutput(true);
     conn.connect();
     int responsecode = conn.getResponseCode();
    // System.out.println(responsecode);
     if(responsecode != 200)
    	 throw new RuntimeException("HttpResponseCode: "+ responsecode);
     else {
    	 BufferedReader br = null;
    	 br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    	 String strCurrentLine;
         while ((strCurrentLine = br.readLine()) != null) {
                System.out.println(strCurrentLine);
         }
return json;
    	
     }
	}
}
	
    // JSONParser parse = new JSONParser();
    // JSONObject jobj = (JSONObject)parse.parse(inline);
     
     
	  