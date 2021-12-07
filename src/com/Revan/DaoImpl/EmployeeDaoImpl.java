package com.Revan.DaoImpl;

import java.util.Iterator;

import javax.transaction.HeuristicMixedException;

import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import net.sf.ehcache.store.TxCopyingCacheStore;

import org.apache.poi.hssf.record.formula.functions.Var;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import antlr.collections.List;

import com.Revan.Util.HibernateUtil;


import com.Reva.Dao.EmployeeDao;
import com.Revan.Pojo.Employee;



public class EmployeeDaoImpl  implements EmployeeDao {
@Autowired
private HibernateUtil hibernateutil;
@Autowired
private HibernateUtil hibernateutil1;
@Autowired
private Employee employee;
	

/*public void setHibernateutil(HibernateUtil hibernateutil) {
	this.hibernateutil = hibernateutil;
}*/

	@Override
	public void insertRecord() throws IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException{
	SessionFactory Factory=hibernateutil.getSessionFactory();
	System.out.println(hibernateutil);
	System.out.println(hibernateutil1);
	Session session=Factory.openSession();
	System.out.println("i am in EmployeeDaoImpl");
	employee.setId(4);
	employee.setUsername("shyam");
	employee.setPassword("444");
	employee.setCity("satara");
	employee.setName("aryan");
	employee.setSalary(20000);
	System.out.println("all is well");
	org.hibernate.Transaction tx= session.beginTransaction();
	session.save(employee);
	System.out.println("Object saved successfully.....!!");
	tx.commit();
	session.close();
	
	}

	@Override
	public void updateRecord() throws SecurityException, IllegalStateException,
			RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException {
		System.out.println("please update record from table employee.....");
		SessionFactory Factory=hibernateutil1.getSessionFactory();
		Session session=Factory.openSession();
		System.out.println("i am in EmployeeDaoImpl");
		employee.setId(1);
		employee.setUsername("aradhya");
		employee.setPassword("111");
		employee.setCity("ranchi");
		employee.setName("govind");
		employee.setSalary(10000);
		System.out.println("all is well");
		org.hibernate.Transaction tx= session.beginTransaction();
		session.update(employee);
		System.out.println("Object update successfully.....!!");
		tx.commit();
		session.close();
		
	}

	@Override
	public void deleteRecord() throws SecurityException, IllegalStateException,
			RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException {
		System.out.println("please delete record from table employee.....");
		SessionFactory Factory=HibernateUtil.getSessionFactory();
		Session session=Factory.openSession();
		System.out.println("i am in EmployeeDaoImpl");
		Employee employee =(Employee) session.get(Employee.class, 8);
		org.hibernate.Transaction tx= session.beginTransaction();
		session.delete(employee);
		System.out.println("Object delete successfully.....!!");
		tx.commit();
		session.close();
		
		
	}

public void selectRecord() throws SecurityException, IllegalStateException,
			RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException {
		System.out.println("please select record from table employee .....");
		SessionFactory Factory=hibernateutil1.getSessionFactory();
		Session session=Factory.openSession();
		System.out.println("i am in EmployeeDaoImpl");
			org.hibernate.Transaction tx= session.beginTransaction();
	session.get(Employee.class, 2);
	System.out.println("Object select successfully.....!!");
	tx.commit();
	session.close();
	}
	
	@Override
	public java.util.List<Employee> selectAllEmpRecord()throws SecurityException, IllegalStateException,
	RollbackException, HeuristicMixedException,
	HeuristicRollbackException, SystemException {
System.out.println("please select Allrecord from table employee .....");
SessionFactory Factory=hibernateutil1.getSessionFactory();
Session session=Factory.openSession();
System.out.println("i am in EmployeeDaoImpl");
org.hibernate.Transaction tx= session.beginTransaction();
Criteria criteria=session.createCriteria(Employee.class);
java.util.List<Employee> list= (java.util.List<Employee>) criteria.list();
System.out.println(" select all record successfully.....!!");
tx.commit();
return criteria.list() ;
	}	
}
