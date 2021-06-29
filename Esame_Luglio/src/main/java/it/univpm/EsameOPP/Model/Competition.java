/**
 * Model of a competition saved in the football API
 * @author Steve 
 * @author Matteo Giacomobono
 * @version 0.1
 */
package com.example.demo;

import java.sql.Struct;

public class Competition {
	
	/* 
	 * Id of the competition
	 *
	 */
	private int id_competition;
	
	/*
	 * Area of the competition
	 */
 // private Struct Area{
    	int id_area;
    	String name_area;
    	String country_code;
    	// unsignedUrl null checking
    
    
    /*
     * Name of the competition
     */
    
    private String name_competition;
    
    /*
     * Code of the competition
     */
    private String CodeCompetition;
    
    /*
     * Emblem of the competition
     */
    
    private String emblem_url ;
    
     /*
      * plan of the competition
      */
    
   private String plan;
   
   /*
    * State of the competition
    */
   
// private Struct State{
	   int season_id;
	   String startDate;
	   String endDate;
	   String current_match;
	   String winner;
	   
	   /*
	    * number of available competition
	    */
	   private int number_competition;
	   /*
	    * last update
	    */
	   
	   private String last_update;
	   
	   public Competition() {
		   this.id_competition=0;
		   this.id_area=0;
		   this.name_area=null;
		   this.country_code=null;
		   this.name_competition=null;
		   this.CodeCompetition=null;
		   this.emblem_url=null;
		   this.plan=null;
		   this.season_id=0;
		   this.startDate=null;
		   this.endDate=null;
		   this.current_match=null;
		   this.winner=null;
		   
		   
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
	   
	
	   
  
   
   public int getId_competition() {
		return id_competition;
	}

	public void setId_competition(int id_competition) {
		this.id_competition = id_competition;
	}

	public int getId_area() {
		return id_area;
	}

	public void setId_area(int id_area) {
		this.id_area = id_area;
	}

	public String getName_area() {
		return name_area;
	}

	public void setName_area(String name_area) {
		this.name_area = name_area;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getName_competition() {
		return name_competition;
	}

	public void setName_competition(String name_competition) {
		this.name_competition = name_competition;
	}

	public String getCodeCompetition() {
		return CodeCompetition;
	}

	public void setCodeCompetition(String codeCompetition) {
		CodeCompetition = codeCompetition;
	}

	public String getEmblem_url() {
		return emblem_url;
	}

	public void setEmblem_url(String emblem_url) {
		this.emblem_url = emblem_url;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public int getSeason_id() {
		return season_id;
	}

	public void setSeason_id(int season_id) {
		this.season_id = season_id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCurrent_match() {
		return current_match;
	}

	public void setCurrent_match(String current_match) {
		this.current_match = current_match;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public int getNumber_competition() {
		return number_competition;
	}

	public void setNumber_competition(int number_competition) {
		this.number_competition = number_competition;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}

}
