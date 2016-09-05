package spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args){
		
		ApplicationContext context = new GenericXmlApplicationContext("jdbc.xml");
		
		jdbcDao dao = context.getBean("jdbcDao2", jdbcDao.class);
		
		List<User> mem = dao.selectAll();
		
		for(User user:mem){
			System.out.println(user);
		}
		
		System.out.println();
		System.out.println("******insert*******");
		int x = dao.insert();
			if(x>0){
				System.out.println("insert 성공");
			}
			else{
				System.out.println("insert 실패");	
			}
		
		System.out.println();
		System.out.println("*****select id=java**********");
		User user = dao.selectOne();
		System.out.println(user);
		
		System.out.println();
		System.out.println("전체 레코드수 : " + dao.selectCount());
		System.out.println();
		System.out.println("END!");
	}
}
