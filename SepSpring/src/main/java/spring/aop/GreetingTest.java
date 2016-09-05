package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class GreetingTest {

	public static void main(String[] args){
		ApplicationContext ctx =
				new GenericXmlApplicationContext("aop.xml");
		GreetingService bean = (GreetingService)ctx.getBean("greetingTarget");
		try{
			bean.sayHello("java");
		} catch(Exception e){}
		bean.sayGoodbye("spring");
	}
}
