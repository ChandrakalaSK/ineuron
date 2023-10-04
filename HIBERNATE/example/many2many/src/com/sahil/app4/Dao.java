package com.sahil.app4;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		
		
		DoctorDto d1=new DoctorDto();
		d1.setDname("ohidur");
		
		DoctorDto d2=new DoctorDto();
		d2.setDname("Ambiya");
		
		PatientDto p1=new PatientDto();
		
		p1.setPname("sahil");
		p1.setPadd("kolkata");
		
		PatientDto p2=new PatientDto();
		
		p2.setPname("Tariq");
		p2.setPadd("kolkata");
		
		ArrayList<DoctorDto> list1=new ArrayList<DoctorDto>();
		list1.add(d1);
		list1.add(d2);
		
		p1.setDid2(list1);
		p2.setDid2(list1);
		
		ss.save(p1);
		ss.save(p2);
		
		Transaction ts = ss.beginTransaction();
		ts.commit();
		
	}

}
