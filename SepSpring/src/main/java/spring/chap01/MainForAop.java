package spring.chap01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.anno.Article;

public class MainForAop {

	public static void main(String[] args){
		String[] configLocations = new String[] {"applicationContext.xml","commonConcern.xml"};
		
		ApplicationContext context = new GenericXmlApplicationContext(configLocations);
		WriteArticleService articleService = (WriteArticleService) context.getBean("writeArticleService");
		//객체꺼낼때는 getBean() -> object타입으로 꺼내옴 => object로부터 물려받은것만 실행시킬수있으므로 형변환
		
		//처음부터 형변환하여꺼내는 방법
		//(WriteArticleService) context.getBean("WriteArticleService") -> context.getBean("WriteArticleService",WriteArticleService.class)
		articleService.write(new Article());
		
		//AOP - 모든작업에 적용이 되는 
		//게시판에 로그인이되어있는상태에서 확인할때 - 로그인되어있는 => AOP
	}
}
