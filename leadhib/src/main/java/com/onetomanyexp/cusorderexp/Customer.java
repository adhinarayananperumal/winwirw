package com.onetomanyexp.cusorderexp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.onetomanyexp.Invoice;

@Entity
@Table(name = "cus_det")
public class Customer {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "cusId")
	private int cusId;

	private String cusName;

	
	@Column(name = "age")
	private int age;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	List<Order> listOrder;
	
	


	public List<Order> getListOrder() {
		return listOrder;
	}


	public void setListOrder(List<Order> listOrder) {
		this.listOrder = listOrder;
	}


	public int getCusId() {
		return cusId;
	}


	public void setCusId(int cusId) {
		this.cusId = cusId;
	}


	public String getCusName() {
		return cusName;
	}


	public void setCusName(String cusName) {
		this.cusName = cusName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}