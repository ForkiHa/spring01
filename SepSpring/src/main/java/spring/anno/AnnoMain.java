package spring.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnoMain {

	public static void main(String[] args){
		AbstractApplicationContext context = new GenericXmlApplicationContext(new String[]{"annoText.xml"});
		Bar bar = context.getBean("bar", Bar.class);
		bar.doBar();
		Foo foo = context.getBean("scottFoo", Foo.class);
		System.out.println(foo.getName());
		
		//�����̳� ��������
		context.registerShutdownHook();
	}
}
