package com.entity.inheritanceexp.tpc;

import javax.persistence.Entity;

@Entity
public class HomeLoanTPC extends LoanTPC {
	
	private String buildingType;
	private String buildingSize;
	private String propertyRegistrationDoc;
	
	
	public String getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}
	public String getBuildingSize() {
		return buildingSize;
	}
	public void setBuildingSize(String buildingSize) {
		this.buildingSize = buildingSize;
	}
	public String getPropertyRegistrationDoc() {
		return propertyRegistrationDoc;
	}
	public void setPropertyRegistrationDoc(String propertyRegistrationDoc) {
		this.propertyRegistrationDoc = propertyRegistrationDoc;
	}
	
	
	

}
