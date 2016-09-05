package spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class jdbcDao extends JdbcDaoSupport{

	/*JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}*/ 
	//JdbcDaoSupport 상속받음
	
	
	
	public List<User> selectAll(){
		String sql ="select * from mem";
		UserRowMapper mapper = new UserRowMapper();
		List<User> member = getJdbcTemplate().query(sql,mapper);
		return member;
	}
	
	public int insert(){
		int x = 0;
		String sql = "insert into mem values(?,?,?,?)";
		Object[] ins = {"kkk","kkk","kkk","kkk@kkk.com"};
		x =getJdbcTemplate().update(sql,ins);
		/*jdbcTemplate.update(sql,"abcde","abcde","abcde","abcde@abcde.com");
		마지막 매개변수자리에는 한번에 넣어줘도 가능*/
		
		return x;
	}
	
	public User selectOne(){
		String sql = "select * from mem where memberid=?"; 
		UserRowMapper mapper = new UserRowMapper();
		String[] j = {"java"};
		User user = getJdbcTemplate().queryForObject(sql,j , mapper);
		return user;
		
	}
	public int selectCount(){
		int count;
		String sql = "select count(*) from mem";
		UserRowMapper mapper = new UserRowMapper();
		count = getJdbcTemplate().queryForObject(sql, Integer.class);
		return count;
	}

}
