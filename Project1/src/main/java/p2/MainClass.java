package p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p1.Sim;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext aContext = new ClassPathXmlApplicationContext("bean2.xml");
		System.out.println("Config is loaded ");
		Student student = (Student)aContext.getBean("stdId");
		student.display();
		System.out.println("_______-----------");
		Student student2 = (Student)aContext.getBean("stdId2");
		System.out.println(student2.getEmail());
		System.out.println(student2.getName());
		System.out.println(student2.getRollno());
		

	}

}
