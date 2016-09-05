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
	
	
	//	@Autowired 타입으로 객체생성 - articleDao를 구현하는 객체가 두개이므로 (MySQLArticle/OracleArticle)
	// @Qualifier("oracle") 에러발생방지
	
	//@Required 필수요소 
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
		System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);
	}
}
