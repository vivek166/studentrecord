package com.synerzip.student.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.synerzip.student.model.StudentFullName;
import com.synerzip.student.model.StudentModel;

public class StudentApplication {

	public static void main(String[] args) {
		StudentFullName full=new StudentFullName();
		full.setFirstName("vivek");
		full.setMidleName("kumar");
		full.setLastName("tiwari");
		StudentModel obj=new StudentModel();
		obj.setsId(101);
		obj.setSalary(10000);
		obj.setFullName(full);
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(StudentModel.class);
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session= sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
		
	}
}
