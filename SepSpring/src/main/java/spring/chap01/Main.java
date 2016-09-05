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
		//��õ�����ʱ⶧���� �� �� (container����� Ŭ����)
		WriteArticleService articleService = (WriteArticleService)beanFactory.getBean("WriteArticleService");
		//��ü�� ������ -> objectŸ���̹Ƿ� ����ȯ 
		articleService.write(new Article());
		//������ �޼��� -> �����޼��� ȣ��
	}
}
