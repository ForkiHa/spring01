package spring.chap01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.anno.Article;
import spring.anno.ArticleDao;


public class MySQLArticleDao implements ArticleDao{
	
	@Override
	public void insert(Article article){
		
		System.out.println("MySQLArticleDao.insert()½ÇÇà");
	}
}
