package spring3controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class TestController {
	@Autowired
	private TestController testController;
	

	public void setTestController(TestController testController) {
		this.testController = testController;
	}


public void revan1()
{
	System.out.println("i am in revan1  of testcontroller class");
	testController.revan2();
}


public void revan2()
{
	System.out.println("i am in revan2  of testcontroller class  ");
	
}

}
