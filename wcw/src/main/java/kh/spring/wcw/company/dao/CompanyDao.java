package kh.spring.wcw.company.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.wcw.company.domain.Company;
import kh.spring.wcw.employee.domain.Employee;
import kh.spring.wcw.notice.domain.Notice;

@Repository
public class CompanyDao {
	
	@Autowired
	private SqlSession sqlsession;
	 
	public Company selectCompany(String email, String password){
		Company result2 = null;
		HashMap<String, String> map= new HashMap<>();
		map.put("email", email);
		map.put("pwd", password);
		
		return sqlsession.selectOne("employeeMapper.selectEmployee", map);
	}
	
}
