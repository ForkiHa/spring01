package spring.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.chap01.WriteArticleService;

public class Maintest1 {

	public static void main(String[] args){
		AbstractApplicationContext context = new GenericXmlApplicationContext("annoText.xml");
		
	
		WriteArticleService articleService = (WriteArticleService)context.getBean("writeArticleService");
		//��ü�� ������ -> objectŸ���̹Ƿ� ����ȯ 
		articleService.write(new Article());
		//������ �޼��� -> �����޼��� ȣ��
		
		context.registerShutdownHook();
	}
	
}
