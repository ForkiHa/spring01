package spring.anno;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mysql") 
//OracleArticleDao �� Ÿ���� ���⶧���� Ÿ������ ó���Ҷ� �����߻�����
public class MySQLArticleDao implements ArticleDao{
	
	@Override
	public void insert(Article article){
		System.out.println("MySQLArticleDao.insert()����");
	}
}
