package com.jbk;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address123")
public class address123 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AID")
	private int addressID;
	@Column(name="PIN")
	private int pin;
	@Column(name="LANE")
	private String lane;
	@Column(name="HOUSENO")
	private String houseNo;
	
	@OneToOne(targetEntity = employee123.class,cascade=CascadeType.ALL)
	private employee123 emp123;

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public employee123 getEmp123() {
		return emp123;
	}

	public void setEmp123(employee123 emp123) {
		this.emp123 = emp123;
	}

	@Override
	public String toString() {
		return "address123 [addressID=" + addressID + ", pin=" + pin + ", lane=" + lane + ", houseNo=" + houseNo
				+ ", emp123=" + emp123 + "]";
	}

	public address123(int addressID, int pin, String lane, String houseNo, employee123 emp123) {
		super();
		this.addressID = addressID;
		this.pin = pin;
		this.lane = lane;
		this.houseNo = houseNo;
		this.emp123 = emp123;
	}

	public address123() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}
