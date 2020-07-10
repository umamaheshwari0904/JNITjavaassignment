package com.springhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDao {
	/*HibernateTemplate ht;
	public void setHt(HibernateTemplate ht) {
		this.ht=ht;
			}
	public void saveEmployee(Employee e) {
		ht.save(e);
	}
	*/
	SessionFactory sef;
	Session se;
	Transaction tx;
	public void setSef(SessionFactory sef) {
		this.sef=sef;
	}
	public void saveEmployee(Employee e)
	{
		se=sef.openSession();
		tx=se.beginTransaction();
		se.save(e);
		tx.commit();
		se.close();
	}
	public Employee getDetails(int id) {
		// TODO Auto-generated method stub
		se=sef.openSession();
		Employee e=(Employee)se.get(Employee.class, id);
		return e;
		}
}
