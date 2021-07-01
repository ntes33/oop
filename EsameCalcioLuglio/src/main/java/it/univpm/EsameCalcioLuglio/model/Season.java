package it.univpm.EsameCalcioLuglio.model;

import java.time.LocalDate;

public class Season {

	// id della stagione
	private int seasonId;

	// inizio della stagione
	private LocalDate startDate;

	// fine della stagione
	private LocalDate endDate;

	// costrutore con i diversi parametri
	public Season(int seasonId, LocalDate startDate, LocalDate endDate) {
		super();
		this.seasonId = seasonId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/*
	 * setter e getter ci permetterano di avere accesso ai nostri campi private
	 * fuori della class
	 */

	public int getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	// per avere tutte le informazioni con una sola stringa
	@Override
	public String toString() {
		return "Season [seasonId=" + seasonId + ", startDate=" + startDate + ", endDate=" + endDate + ", getSeasonId()="
				+ getSeasonId() + ", getStartDate()=" + getStartDate() + ", getEndDate()=" + getEndDate() + "]";
	}

}
