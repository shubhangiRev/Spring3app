package com.Revan.Service;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import antlr.collections.List;

import com.Revan.Pojo.Employee;

public interface EmployeeService {
	public void insertRecord() throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;
	
	public void updateRecord() throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;

	public void deleteRecord() throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;

	public void selectRecord() throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;
    
	public java.util.List<Employee> selectAllEmpRecord()throws SecurityException, IllegalStateException,
	RollbackException, HeuristicMixedException,
	HeuristicRollbackException, SystemException; 
    
}
