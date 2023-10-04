package com.sahil.app1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Employee_Contact")
public class ConDto {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
 private int eid;
 private long phno;
 public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "ConDto [eid=" + eid + ", phno=" + phno + "]";
}

}
