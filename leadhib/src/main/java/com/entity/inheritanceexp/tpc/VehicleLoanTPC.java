package com.entity.inheritanceexp.tpc;

import javax.persistence.Entity;

@Entity
public class VehicleLoanTPC extends LoanTPC{
	
	
	private String vehicleNo;
	private String rcNo;
	private String accidentHistory;
	private String vehicleOwner;
	
	
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getRcNo() {
		return rcNo;
	}
	public void setRcNo(String rcNo) {
		this.rcNo = rcNo;
	}
	public String getAccidentHistory() {
		return accidentHistory;
	}
	public void setAccidentHistory(String accidentHistory) {
		this.accidentHistory = accidentHistory;
	}
	public String getVehicleOwner() {
		return vehicleOwner;
	}
	public void setVehicleOwner(String vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}
	
	
	

}
