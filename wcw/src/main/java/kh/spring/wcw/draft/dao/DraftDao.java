package kh.spring.wcw.draft.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.wcw.draft.domain.Draft;
import kh.spring.wcw.employee.domain.Employee;

@Repository
public class DraftDao {
	
	@Autowired
	private SqlSession sqlsession;
	
	// 직원 리스트 조회
	public List<Employee> selectEmployeeList(int cp_no){
		return sqlsession.selectList("draftMapper.selectEmployee", cp_no);
	}
	
	// 기안 작성
	public int insertDraft(Draft darft){
		return sqlsession.insert("draftMapper.insertDraft", darft);
	}
	
	// 기안함 리스트
	public List<Draft> selectListDraft(int ep_no, RowBounds rowBounds){
		return sqlsession.selectList("draftMapper.selectListDraft", ep_no, rowBounds);
	}
	
	// 결재함 리스트
	public List<Draft> selectListAppr(int emp_no, RowBounds rowBounds){
		return sqlsession.selectList("draftMapper.selectListAppr", emp_no, rowBounds);
	}
	
	// 기안 상세 보기
	public List<Draft> selectDraft(int dr_no, int dr_sort){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("dr_no", dr_no);
		map.put("dr_sort", dr_sort);
		System.out.println(dr_sort);
		return sqlsession.selectList("draftMapper.selectDraft", map);
	}
}
