package it.univpm.EsameCalcioLuglio.model;

public class FootballTeam {

	// informazioni sul paese di origine della squadra
	private Areas teamArea;

	// id del paese
	private Integer teamId;

	// nome della squadra
	private String teamName;

	// abreviazione ella team
	private String shortName;

	//
	private String crestUrl;

	public FootballTeam(Areas teamArea, Integer teamId, String teamName, String shortName, String crestUrl) {
		super();
		this.teamArea = teamArea;
		this.teamId = teamId;
		this.teamName = teamName;
		this.shortName = shortName;
		this.crestUrl = crestUrl;
	}

	public Areas getTeamArea() {
		return teamArea;
	}

	public void setTeamArea(Areas teamArea) {
		this.teamArea = teamArea;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getCrestUrl() {
		return crestUrl;
	}

	public void setCrestUrl(String crestUrl) {
		this.crestUrl = crestUrl;
	}

	@Override
	public String toString() {
		return "FootballTeam [teamArea=" + teamArea + ", teamId=" + teamId + ", teamName=" + teamName + ", shortName="
				+ shortName + ", crestUrl=" + crestUrl + ", getTeamArea()=" + getTeamArea() + ", getTeamId()="
				+ getTeamId() + ", getTeamName()=" + getTeamName() + ", getShortName()=" + getShortName()
				+ ", getCrestUrl()=" + getCrestUrl() + "]";
	}

}
