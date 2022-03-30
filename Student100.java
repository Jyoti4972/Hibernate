package com.jbk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student100")
public class Student100 {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Column(name="ID")
	private long id;
	@Column(name="NAME")
	private String name;
	@Column(name="CONTACT")
	private String contact;
	public long getId() {
		return id;
	}
	public void setId(Long long1) {
		this.id = long1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student100 [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	public Student100(long id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	public Student100() {
		// TODO Auto-generated constructor stub
	}
	

}
