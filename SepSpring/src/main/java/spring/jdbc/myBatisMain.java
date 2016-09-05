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
		
		//�μ�Ʈ
		/*int x = 0;
		User user = new User("hh","hh","hh","hh@hh.com");
		x = dao.insertMem(user);*/
		
		//������Ʈ
		/*	int up = dao.updateMem(); 
		if(up==1){
			System.out.println("update ����");
		} else{
			System.out.println("update ����");
		}*/
		
		//���̺� ����
		/*int del = dao.deleteMem("hh");
		if(del==1){
			System.out.println("delete ����");
		} else{
			System.out.println("delete ����");
		}*/
		
		//�ϳ��� ��������
	/*	User user = dao.selectOneMem("kkk");
		System.out.println(user);*/
		
		//����
		int count = dao.selectCount();
		System.out.println("mem���̺��� �� ����::"+ count);
		
		
		
		
		
		System.out.println("End!!");
	}
}
