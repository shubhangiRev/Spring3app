package com.Revan.ServiceImpl;

import java.util.Iterator;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import antlr.collections.List;

import com.Reva.Dao.EmployeeDao;
import com.Revan.Pojo.Employee;
import com.Revan.Service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	@Qualifier(value="EmployeeDaoImpl")
	private EmployeeDao employeeDao;
	@Override
	public void insertRecord() throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException{
		System.out.println("i am in EmployeeServiceImpl");
		employeeDao.insertRecord();
	}
	@Override
	public void updateRecord() throws SecurityException, IllegalStateException,
			RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException {
		System.out.println("please update record in emploee table from employeeservice");
		employeeDao.updateRecord();
	}
	@Override
	public void deleteRecord() throws SecurityException, IllegalStateException,
			RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException {
		System.out.println("please delete record in emploee table from employeeservice");
		employeeDao.deleteRecord();
	}
	@Override
	public void selectRecord() throws SecurityException, IllegalStateException,
			RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException {
		System.out.println("please update record in emploee table from employeeservice");
		employeeDao.selectRecord();
	}
	@Override
	public java.util.List<Employee> selectAllEmpRecord()throws SecurityException, IllegalStateException,
	RollbackException, HeuristicMixedException,
	HeuristicRollbackException, SystemException  {
		
		java.util.List<Employee> emp= employeeDao.selectAllEmpRecord();
		for (Iterator iterator = emp.iterator(); iterator.hasNext();) {
			System.out.println("i am in serviceImpl");
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.getUsername());
			System.out.println(employee.getPassword());
		}
		return emp;
					}
	
}
