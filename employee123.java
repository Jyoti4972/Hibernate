package com.jbk;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="Employee123")
public class employee123 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	@PrimaryKeyJoinColumn
	private int eid;
	@Column(name="Name")
	private String ename;
	
	@OneToOne(targetEntity = address123.class, cascade=CascadeType.ALL)
	private address123 ad123;
	
	
	public employee123(int eid, String ename, address123 ad123) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ad123 = ad123;
	}
	public address123 getAd123() {
		return ad123;
	}
	public void setAd123(address123 ad123) {
		this.ad123 = ad123;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public employee123(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "employee123 [eid=" + eid + ", ename=" + ename + ", ad123=" + ad123 + "]";
	}
	
public employee123() {
	
}
}
