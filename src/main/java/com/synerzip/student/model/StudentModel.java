package com.synerzip.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alien_table")
public class StudentModel {

	@Override
	public String toString() {
		return "StudentModel [sId=" + sId + ", fullName=" + fullName
				+ ", salary=" + salary + "]";
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public StudentFullName getFullName() {
		return fullName;
	}
	public void setFullName(StudentFullName fullName) {
		this.fullName = fullName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Id
	int sId;
	StudentFullName fullName;
	int salary;
}
