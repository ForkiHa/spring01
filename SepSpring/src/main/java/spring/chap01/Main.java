package spring.chap01;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring.anno.Article;

public class Main {
	
	public static void main(String[] args){
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		//추천하지않기때문에 줄 감 (container만드는 클래스)
		WriteArticleService articleService = (WriteArticleService)beanFactory.getBean("WriteArticleService");
		//객체를 꺼내옴 -> object타입이므로 형변환 
		articleService.write(new Article());
		//다형성 메서드 -> 실제메서드 호출
	}
}
