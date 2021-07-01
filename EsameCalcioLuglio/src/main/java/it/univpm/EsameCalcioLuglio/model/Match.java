package it.univpm.EsameCalcioLuglio.model;

import java.time.LocalDate;

public class Match {

	// id della partita
	private int matchId;

	// stagione in cui si gioca la partita
	private Season season;

	// divisione della squadra

	// private String divisione;

	// data
	private LocalDate matchday;

	// costrutore con i diversi parametri
	public Match(int matchId, Season season, LocalDate matchday) {
		super();
		this.matchId = matchId;
		this.season = season;
		this.matchday = matchday;
	}

	/*
	 * setter e getter ci permetterano di avere accesso ai nostri campi private
	 * fuori della class
	 */
	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public LocalDate getMatchday() {
		return matchday;
	}

	public void setMatchday(LocalDate matchday) {
		this.matchday = matchday;
	}

	// per avere tutte le informazioni con una sola stringa

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", season=" + season + ", matchday=" + matchday + ", getMatchId()="
				+ getMatchId() + ", getSeason()=" + getSeason() + ", getMatchday()=" + getMatchday() + "]";
	}

}