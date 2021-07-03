package it.univpm.EsameCalcioLuglio.model;

public class Competitions {

	// informazione sulla stagione in cui si gioca
	private Season season;

	// nome della competizione
	private String competitionName;

	private Integer competionCode = null;

	// livello della competizione
	private String CompetitionPlan;

	public Competitions(Season season, String competitionName, Integer competionCode, String competitionPlan) {
		super();
		this.season = season;
		this.competitionName = competitionName;
		this.competionCode = competionCode;
		CompetitionPlan = competitionPlan;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public String getCompetitionName() {
		return competitionName;
	}

	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}

	public Integer getCompetionCode() {
		return competionCode;
	}

	public void setCompetionCode(Integer competionCode) {
		this.competionCode = competionCode;
	}

	public String getCompetitionPlan() {
		return CompetitionPlan;
	}

	public void setCompetitionPlan(String competitionPlan) {
		CompetitionPlan = competitionPlan;
	}

	@Override
	public String toString() {
		return "Competitions [season=" + season + ", competitionName=" + competitionName + ", competionCode="
				+ competionCode + ", CompetitionPlan=" + CompetitionPlan + ", getSeason()=" + getSeason()
				+ ", getCompetitionName()=" + getCompetitionName() + ", getCompetionCode()=" + getCompetionCode()
				+ ", getCompetitionPlan()=" + getCompetitionPlan() + "]";
	}

}
