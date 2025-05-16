package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.micrometer.observation.Observation.Context;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Config is loaded ");
		Sim sim = (Sim)context.getBean("sim1");
		sim.Calling();
		sim.data();
		
		Sim sim2 = (Sim)context.getBean("sim2");
		sim2.Calling();
		sim2.data();

	}

}
