/**
 * Model of a competition saved in the football API
 * @author Steve 
 * @author Matteo Giacomobono
 * @version 0.1
 */
package it.univpm.EsameOPP.Model;

import java.sql.Struct;
import java.util.Date;

public class Competition {
	
	/* 
	 * Id of the competition
	 *
	 */
	private int id;
	
	/*
	 * Area of the competition
	 */
     String from;
    
    /*
     * Name of the competition
     */
    
    private String name_competition;
    
   /*
    * Season State
    */
   
   Date starting;
  Date finishing;
  Date season;
  
	   
	   public Competition() {
		   this.id=0;
		   this.name_competition=null;
		   this.starting=null;
		   this.finishing=null;
		   this.season=null;
		   
		   
		   
		   /**
			 * Competition constructor with parameters
			 * @param id_competition id of the competition
			 * @param id_area id of the area where the competition works
			 * @param name_area name of the area where the competition works
			 * @param country_code the code of the country 
			 * @param name_competition name of the competition
			 * @param CodeCompetition code of the competition
			 * @param emblem_url pic of the emblem
			 * @param plan plan of the competition 
			 * 
			 */
		    
		   
		   
		   
	   }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getName_competition() {
		return name_competition;
	}


	public void setName_competition(String name_competition) {
		this.name_competition = name_competition;
	}


	public Date getStarting() {
		return starting;
	}


	public void setStarting(Date starting) {
		this.starting = starting;
	}


	public Date getFinishing() {
		return finishing;
	}


	public void setFinishing(Date finishing) {
		this.finishing = finishing;
	}


	public Date getSeason() {
		return season;
	}


	public void setSeason(Date season) {
		this.season = season;
	}
	   
}
	   
  
   
   