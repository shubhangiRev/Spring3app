package spring3controller;

import java.util.Iterator;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.validation.Valid;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.sql.ordering.antlr.Factory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.xhtmlrenderer.css.parser.property.PrimitivePropertyBuilders.Src;

import antlr.collections.List;

import com.Revan.Pojo.Employee;
import com.Revan.Pojo.Index;
import com.Revan.Service.EmployeeService;
import com.Revan.Util.HibernateUtil;


@Controller
@RequestMapping("student")
public class EmployeeController {

   
   
	@Autowired
	@Qualifier(value="EmployeeServiceImpl")
	private EmployeeService employeeService;
	
	/*@Autowired
	private TestController testController;
	

	public void setTestController(TestController testController) {
		this.testController = testController;
	}*/
	
	/*private EmployeeController employeeController;
	
	public void setEmployeeController(EmployeeController employeeController) {
		this.employeeController = employeeController;
	}*/

	@Autowired
	private ContracEmployee contracemployee;
	@Autowired
	private HibernateUtil hibernateutil;
	
	public void setContracemployee(ContracEmployee contracemployee) {
		this.contracemployee = contracemployee;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String getForm(){
		System.out.println("form");
		return "student/form";
	}
	
	
	@RequestMapping(value="/log" , method = RequestMethod.POST)
	public ModelAndView viewArchivedAreaResponse(@Valid @ModelAttribute Index index,BindingResult result) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
		{
		System.out.println("i am in controlle student/log request");
		    if(result.hasErrors()){
			System.out.println(result.getAllErrors());
			ModelAndView mv = new ModelAndView("student/index");
			return mv;
		     }
		    
		    
		    
		    
		//Data from servlet perspective
	/*	System.out.println(request.getServerName());
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		System.out.println(username);
		System.out.println(password);*/
		
		    //data from modelattribute   
		  /*System.out.println(index.getUsername());
		System.out.println(index.getPassword());*/
		    
		   //Database opration 
		    
		/*java.util.List<Employee> list=employeeService.selectAllEmpRecord();
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
				String usernameDB=employee.getUsername();
				String passDB=employee.getPassword();
				System.out.println("i am in controller record");
				System.out.println(usernameDB);
				System.out.println(passDB);
			   if(employee.getUsername().equals(index.getUsername()) && employee.getPassword().equals(index.getPassword())){
				return "success";	
						}
			}
			*/
			/*@SuppressWarnings("deprecation")
			ModelMap addObject = map.addObject("list", list);
		System.out.println(contracemployee.toString());
		contracemployee.empinfo();
		System.out.println(employeeService.toString());*/
		//employeeService.insertRecord(); 
		//employeeService.updateRecord();
		//employeeService.deleteRecord();
		//employeeService.selectRecord();
		
	    System.out.println(" i am in viewArchivedAreaResponse  method after afecting record ...");
	    ModelAndView mv = new ModelAndView("student/index");
		return mv;
		
	 }
	
	public void revan(){
		System.out.println("i am in revan of employeecontroller");
	}
		
	}
	

