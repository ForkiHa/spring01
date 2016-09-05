package spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import spring.chap01.WriteArticleService;

@Component("writeArticleService")
public class WriteArticleServiceImpl implements WriteArticleService {
	
	WriteArticleServiceImpl(){
		
	}
	
	private ArticleDao articleDao;
	
	
	//	@Autowired Ÿ������ ��ü���� - articleDao�� �����ϴ� ��ü�� �ΰ��̹Ƿ� (MySQLArticle/OracleArticle)
	// @Qualifier("oracle") �����߻�����
	
	//@Required �ʼ���� 
	@Autowired
	@Qualifier("oracle")
	@Required
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
		
	}

	public WriteArticleServiceImpl(ArticleDao articleDao){
		this.articleDao = articleDao;
	}
	
	@Override
	public void write(Article article){
		System.out.println("WriteArticleServiceImpl.write() �޼��� ����");
		articleDao.insert(article);
	}
}
