package com.sahil.app4;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="doctor")
public class DoctorDto {
	@Id
	@GenericGenerator(name="name",strategy="increment")
	@GeneratedValue(generator="name")
	private int did;
	private String dname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Doc_Pat", joinColumns=@JoinColumn(name="did"),inverseJoinColumns=@JoinColumn(name="pid"))
	Collection<PatientDto> pid2;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Collection<PatientDto> getPid2() {
		return pid2;
	}
	public void setPid2(Collection<PatientDto> pid2) {
		this.pid2 = pid2;
	}
}
