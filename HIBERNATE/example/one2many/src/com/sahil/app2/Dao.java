package com.sahil.app2;

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

		
		
		PersionDto pdto1=new PersionDto();
		
		pdto1.setPname("sahil");
		pdto1.setPadd("kolkata");
		
		MobileDto mdto1=new MobileDto();
		mdto1.setMobile(9593014636l);
		
		MobileDto mdto2=new MobileDto();
		mdto2.setMobile(7278008154l);
		
		ArrayList<MobileDto> list1=new ArrayList<MobileDto>();
		list1.add(mdto1);
		list1.add(mdto2);
		pdto1.setMobile1(list1);
		
		ss.save(pdto1);
		Transaction ts = ss.beginTransaction();
		ts.commit();
	}

}
