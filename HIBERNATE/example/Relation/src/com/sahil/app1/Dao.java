package com.sahil.app1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EmpDto.class);
		cfg.addAnnotatedClass(ConDto.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		EmpDto edto=new EmpDto();
		edto.setName("sahil");
		
		ConDto cdto=new ConDto();
		cdto.setPhno(9593014636l);
		edto.setCon(cdto);
		ss.save(edto);
		Transaction ts=ss.beginTransaction();
		ts.commit();
	}

}
