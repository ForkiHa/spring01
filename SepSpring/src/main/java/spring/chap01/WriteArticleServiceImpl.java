package spring.chap01;


import spring.anno.Article;
import spring.anno.ArticleDao;


public class WriteArticleServiceImpl implements WriteArticleService {
	
	WriteArticleServiceImpl(){
		
	}
	
	private ArticleDao articleDao;
	

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

