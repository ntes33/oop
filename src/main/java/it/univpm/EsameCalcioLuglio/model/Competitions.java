/**
 * Model of a competition saved in the football API
 * @author Steve 
 * @author Matteo Giacomobono
 * @version 1.0
 */


package it.univpm.EsameCalcioLuglio.model;

import java.util.Date;

public class Competitions {
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
  
	   
	   public Competitions() {
		   this.id=0;
		   this.name_competition=null;
		   this.starting=null;
		   this.finishing=null;
		   this.season=null;
	   }

	   
	   
	/*
	 * Getter and Setter
	 */

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





	@Override
	public String toString() {
		return "Competitions [season=" + season + ", competitionName=" + name_competition + ", competionCode="
				+ id + ", getSeason()=" + getSeason()
				+ ", getCompetitionName()=" + getName_competition() + ", getCompetionCode()=" + getId();
	}

}
