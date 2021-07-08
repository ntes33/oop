/*package it.univpm.EsameOPP.Utility;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.codehaus.jettison.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Path;
import java.net.HttpURLConnection;

import it.univpm.EsameOPP.Model.Competition;

public class GetCompetition {
	
	public static JSONObject getJSON() {
		final String url="http://api.football-data.org/v2/competitions/2000";
		JSONObject json=new JSONObject();
	/*GetCompetition client = new GetCompetition().newCompetition().build();
			Request request = new Competition()
			  .url("http://api.football-data.org/v2/competitions")
			  .method("GET", null)
			  .addHeader("c59e26957408404d90d505ab38373d18", "")
			  .build();
			Response response = client.newCall(request).execute();*/
			
			
		/*	OkHttpClient client = new OkHttpClient().newBuilder()
					  .build();
					Request request = new Request.Builder()
					  .url("http://api.football-data.org/v2/competitions/{id}")
					  .method("GET", null)
					  .addHeader("X-Auth-Token", "c59e26957408404d90d505ab38373d18")
					  .addHeader("Authorization", "Bearer 	c59e26957408404d90d505ab38373d18")
					  .build();
					Response response = client.newCall(request).execute();
                    System.out.println(response);*/
	/*	
		try {
			HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
			urlConnection.setRequestProperty("Content-Type", "application/json");
			urlConnection.setRequestMethod("GET");
			urlConnection.setRequestProperty("Authorization", "Bearer c59e26957408404d90d505ab38373d18");
			urlConnection.setRequestProperty("X-Auth-Token" , "c59e26957408404d90d505ab38373d18");
			urlConnection.addRequestProperty("User-Agent",	"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			urlConnection.setDoOutput(true); //to enable the input of body
			//String str=" {\"path\": " + "\""+ folderName.toString().replace('\\', '/') + "\""+ ", \"recursive\": " +true +"}";
			//try(OutputStream os = urlConnection.getOutputStream()){ //to read the body with the parameters for the api
				//byte[] input = str.getBytes("utf-8");
				//os.write(input, 0, input.length);
			*/



