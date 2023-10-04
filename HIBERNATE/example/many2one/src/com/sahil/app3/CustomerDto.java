package com.sahil.app3;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="customer")
public class CustomerDto {
	@Id
	@GenericGenerator(name="name",strategy="increment")
	@GeneratedValue(generator="name")
	private int cid;
	private String cname;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vid", referencedColumnName="vid")
	VendorDto v;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public VendorDto getV() {
		return v;
	}
	public void setV(VendorDto v) {
		this.v = v;
	}

}
