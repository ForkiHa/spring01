package spring.anno;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mysql") 
//OracleArticleDao 와 타입이 같기때문에 타입으로 처리할때 에러발생방지
public class MySQLArticleDao implements ArticleDao{
	
	@Override
	public void insert(Article article){
		System.out.println("MySQLArticleDao.insert()실행");
	}
}
