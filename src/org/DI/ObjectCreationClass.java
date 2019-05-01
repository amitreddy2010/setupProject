package org.DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class ObjectCreationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IndependentDrawClass idDraw = new IndependentDrawClass();
//		idDraw.draw();
		
		
//		Object creation via bean factory
//		BeanFactory factory  = new XmlBeanFactory(new FileSystemResource("spring1.xml"));
		
//		Object creation via bean factory
//		BeanFactory context  = new XmlBeanFactory(new FileSystemResource("spring1.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		IndependentDrawClass idDrawClass = (IndependentDrawClass) context.getBean("drawClass");
		idDrawClass.draw();
		
		
		
	}

}
