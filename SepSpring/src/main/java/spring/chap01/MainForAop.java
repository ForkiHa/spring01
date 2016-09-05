package spring.chap01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.anno.Article;

public class MainForAop {

	public static void main(String[] args){
		String[] configLocations = new String[] {"applicationContext.xml","commonConcern.xml"};
		
		ApplicationContext context = new GenericXmlApplicationContext(configLocations);
		WriteArticleService articleService = (WriteArticleService) context.getBean("writeArticleService");
		//��ü�������� getBean() -> objectŸ������ ������ => object�κ��� ���������͸� �����ų�������Ƿ� ����ȯ
		
		//ó������ ����ȯ�Ͽ������� ���
		//(WriteArticleService) context.getBean("WriteArticleService") -> context.getBean("WriteArticleService",WriteArticleService.class)
		articleService.write(new Article());
		
		//AOP - ����۾��� ������ �Ǵ� 
		//�Խ��ǿ� �α����̵Ǿ��ִ»��¿��� Ȯ���Ҷ� - �α��εǾ��ִ� => AOP
	}
}
