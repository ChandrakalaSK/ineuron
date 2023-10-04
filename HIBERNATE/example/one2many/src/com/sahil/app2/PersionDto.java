package com.sahil.app2;


import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="persion")
public class PersionDto {
@Id
@GenericGenerator(name="auto",strategy="increment")
@GeneratedValue(generator="auto")
private int pid;
private String pname;
private String Padd;

@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="pid", referencedColumnName="pid")
Collection<MobileDto> mobile1;

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
	return Padd;
}
public void setPadd(String padd) {
	Padd = padd;
}
public Collection<MobileDto> getMobile1() {
	return mobile1;
}
public void setMobile1(Collection<MobileDto> mobile1) {
	this.mobile1 = mobile1;
}


}
