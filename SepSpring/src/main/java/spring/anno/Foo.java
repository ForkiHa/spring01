package spring.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//@Component
//foo 라는 이름으로 빈으로 등록 
public class Foo {

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void doFoo(){
		System.out.println("Foo.doFoo");
	}
	
	@PostConstruct
	//초기화 
	public void start(){
		System.out.println("Foo.start");
	}
	
	@PreDestroy
	public void stop(){
		System.out.println("Foo.Stop");
	}
}
