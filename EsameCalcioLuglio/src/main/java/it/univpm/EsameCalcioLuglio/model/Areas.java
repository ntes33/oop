package it.univpm.EsameCalcioLuglio.model;

public class Areas {

	// id della nazione
	private Integer areaId;

	// nome della nazione
	private String areaName;

	// codice della nazione
	private String countryCode;

	// Continente della nazione
	private String parentArea;

	
	public Areas(Integer areaId, String areaName, String countryCode, String parentArea) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
		this.countryCode = countryCode;
		this.parentArea = parentArea;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getParentArea() {
		return parentArea;
	}

	public void setParentArea(String parentArea) {
		this.parentArea = parentArea;
	}

	
	@Override
	public String toString() {
		return "Areas [areaId=" + areaId + ", areaName=" + areaName + ", countryCode=" + countryCode + ", parentArea="
				+ parentArea + ", getAreaId()=" + getAreaId() + ", getAreaName()=" + getAreaName()
				+ ", getCountryCode()=" + getCountryCode() + ", getParentArea()=" + getParentArea() + "]";
	}

}
