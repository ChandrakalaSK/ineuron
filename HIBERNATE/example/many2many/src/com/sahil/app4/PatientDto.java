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
@Table(name="patient")
public class PatientDto {
	@Id
	@GenericGenerator(name="name",strategy="increment")
	@GeneratedValue(generator="name")
	private int pid;
	private String pname;
	private String padd;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Doc_Pat", joinColumns=@JoinColumn(name="did"),inverseJoinColumns=@JoinColumn(name="pid"))
	Collection<DoctorDto> did2;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public Collection<DoctorDto> getDid2() {
		return did2;
	}
	public void setDid2(Collection<DoctorDto> did2) {
		this.did2 = did2;
	}

}
