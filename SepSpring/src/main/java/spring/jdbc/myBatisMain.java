package spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class myBatisMain {

	public static void main(String [] args){
		ApplicationContext context = new GenericXmlApplicationContext("mybatis.xml");
		
		MemberDao dao = context.getBean("dao",MemberDao.class);
		
		/*List<User> mem = dao.selectAllMem();
		
		for(User user:mem){
			System.out.println(user);
		}*/
		
		//인설트
		/*int x = 0;
		User user = new User("hh","hh","hh","hh@hh.com");
		x = dao.insertMem(user);*/
		
		//업데이트
		/*	int up = dao.updateMem(); 
		if(up==1){
			System.out.println("update 성공");
		} else{
			System.out.println("update 실패");
		}*/
		
		//테이블 삭제
		/*int del = dao.deleteMem("hh");
		if(del==1){
			System.out.println("delete 성공");
		} else{
			System.out.println("delete 실패");
		}*/
		
		//하나만 꺼내오기
	/*	User user = dao.selectOneMem("kkk");
		System.out.println(user);*/
		
		//갯수
		int count = dao.selectCount();
		System.out.println("mem테이블의 총 갯수::"+ count);
		
		
		
		
		
		System.out.println("End!!");
	}
}
