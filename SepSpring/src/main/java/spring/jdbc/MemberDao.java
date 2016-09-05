package spring.jdbc;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class MemberDao extends SqlSessionDaoSupport{

	/*SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}*/
	//SqlSessionDaoSupport을 상속받음
	
	public List<User> selectAllMem(){
		return getSqlSession().selectList("myMem.selectAll");
	}
	
	public int insertMem(User user){
		int x = getSqlSession().insert("myMem.insert", user);
		return x;
	}
	
	public int updateMem(){
		HashMap hm = new HashMap();
		hm.put("id", "kkk");
		hm.put("name","kha");
		int x = getSqlSession().update("myMem.updateMem", hm);
		return x;
	}
	
	public int deleteMem(String id){
		int x = getSqlSession().delete("myMem.deleteMem", id);
		return x;
	}
	
	public User selectOneMem(String id){
		User user = getSqlSession().selectOne("myMem.selectOne", id);
		return user;
	}
	
	public int selectCount(){
		int Count = getSqlSession().selectOne("myMem.selectCount");
		return Count;
	}
	
}
