package spring.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.chap01.WriteArticleService;

public class Maintest1 {

	public static void main(String[] args){
		AbstractApplicationContext context = new GenericXmlApplicationContext("annoText.xml");
		
	
		WriteArticleService articleService = (WriteArticleService)context.getBean("writeArticleService");
		//객체를 꺼내옴 -> object타입이므로 형변환 
		articleService.write(new Article());
		//다형성 메서드 -> 실제메서드 호출
		
		context.registerShutdownHook();
	}
	
}
