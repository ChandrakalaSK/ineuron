package com.sahil.app3;

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

		
		
		CustomerDto cdto=new CustomerDto();
		cdto.setCname("santu");
		CustomerDto cdto1=new CustomerDto();
		cdto1.setCname("wasim");
		CustomerDto cdto2=new CustomerDto();
		cdto2.setCname("bajirao");
		
		VendorDto vdto=new VendorDto();
		vdto.setItem1("Sugar");
		vdto.setItem2("salt");
		
		cdto.setV(vdto);
		cdto1.setV(vdto);
		cdto2.setV(vdto);
		
		ss.save(cdto);
		ss.save(cdto1);
		ss.save(cdto2);
		
		Transaction ts = ss.beginTransaction();
		ts.commit();
		
	}

}
