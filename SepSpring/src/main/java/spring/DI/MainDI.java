package spring.DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDI {

	public static void main(String[] args){
		AbstractApplicationContext context = new GenericXmlApplicationContext("DIEx.xml");
		Foo f = context.getBean("foo", Foo.class);
		Foo f1 = context.getBean("foo", Foo.class);
		f.doFOO();
		System.out.println(f==f1);
		f.setI(100);
		System.out.println(f1.i);
		// singleton : 100  / prototype : 10
		
		context.registerShutdownHook();
		//컨테이너 강제종료-stop()호출확인 
	}
}

