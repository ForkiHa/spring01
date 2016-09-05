package spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//애노테이션 사용하려면 xml에 scan!!
@Component("greetingTarget")
public class GreetingServiceImpl implements GreetingService{
	
	private String greeting;
	
	@Value("abc")
	public void setGreeting(String greeting){
		this.greeting = greeting;
	}
	//greeting이 객체이면 @autowired / @repository // 기본타입이나 string이면 @Value
	
	//핵심로직
	public void sayHello(String name) throws Exception{
		System.out.println("sayHello :"+ greeting+ ":" + name);
		throw new Exception("강제 예외 발생");
	}
	
	//핵심로직
	public void sayGoodbye(String name){
		System.out.println("sayGoodbye :"+ greeting+ ":" + name);
	}

}
