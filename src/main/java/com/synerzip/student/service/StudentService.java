package com.synerzip.student.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.synerzip.student.config.StudentConfiguration;
import com.synerzip.student.model.StudentFullName;
import com.synerzip.student.model.StudentModel;

public class StudentService {
	public static void setRecord(int id, StudentFullName name, int salary) {
		StudentModel obj=new StudentModel();
		Session session = StudentConfiguration.getSession();
		Transaction tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
		System.out.println("new record inserted");
	}

	/*public  void getRecord() {
		StudentModel obj = new StudentModel();

		Session session = StudentConfiguration.getSession();
		Transaction tx = session.beginTransaction();
		obj=(StudentModel) session.get(StudentModel.class,168);
		tx.commit();
		System.out.println(obj);
	}*/
}
