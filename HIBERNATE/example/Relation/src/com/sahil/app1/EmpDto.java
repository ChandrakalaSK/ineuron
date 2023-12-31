package com.sahil.app1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Employee")
public class EmpDto {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	@OneToOne(cascade=CascadeType.ALL)
	ConDto con;
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmpDto [id=" + id + ", name=" + name + "]";
	}
	public ConDto getCon() {
		return con;
	}
	public void setCon(ConDto con) {
		this.con = con;
	}
	

}
