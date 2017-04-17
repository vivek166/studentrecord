package com.synerzip.student.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.synerzip.student.model.StudentModel;

public class StudentConfiguration {

	public static Session getSession(){
		Configuration con = new Configuration().configure().addAnnotatedClass(StudentModel.class);
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		return sf.openSession();
	}
}
