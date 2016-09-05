package spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//�ֳ����̼� ����Ϸ��� xml�� scan!!
@Component("greetingTarget")
public class GreetingServiceImpl implements GreetingService{
	
	private String greeting;
	
	@Value("abc")
	public void setGreeting(String greeting){
		this.greeting = greeting;
	}
	//greeting�� ��ü�̸� @autowired / @repository // �⺻Ÿ���̳� string�̸� @Value
	
	//�ٽɷ���
	public void sayHello(String name) throws Exception{
		System.out.println("sayHello :"+ greeting+ ":" + name);
		throw new Exception("���� ���� �߻�");
	}
	
	//�ٽɷ���
	public void sayGoodbye(String name){
		System.out.println("sayGoodbye :"+ greeting+ ":" + name);
	}

}
