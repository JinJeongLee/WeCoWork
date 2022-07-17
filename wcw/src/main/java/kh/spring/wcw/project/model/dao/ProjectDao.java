package kh.spring.wcw.project.model.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.wcw.project.domain.Project;

@Repository
public class ProjectDao {
	
	@Autowired
	private SqlSession sqlsession;
	
	public int insertProject(Project project) {
		return sqlsession.insert("Project.insertProject", project);
	}
	
	public int insertProjectEmp(Project project) {
		return sqlsession.insert("Project.insertProjectEmp", project);
	}
	
	public List<Project> selectListProject(int emp_no) {
		return sqlsession.selectList("Project.selectListProject", emp_no);
	}
	
	public int insertFavoriteProject(Project project) {
		return sqlsession.insert("Project.insertFavoriteProject", project);
	}
	
	public int deleteFavoriteProject(Project project) {
		return sqlsession.delete("Project.deleteFavoriteProject", project);
	}
	
	public Project selectProject(int pr_no) {
		return sqlsession.selectOne("Project.selectProject", pr_no);
	}
	
	public Project selectEmpProject(Project project) {
		return sqlsession.selectOne("Project.selectEmpProject", project);
	}
	
	public List<Project> selectListBoardProject(Project project) {
		return sqlsession.selectList("Project.selectListBoardProject", project);
	}
	
	public List<Project> selectListBoardFixProject(Project project) {
		return sqlsession.selectList("Project.selectListBoardFixProject", project);
	}
	
	public int insertDoBoardProject(Project project) {
		return sqlsession.insert("Project.insertDoBoardProject", project);
	}
	
	public Project selectOneBoardProject(int pb_no) {
		return sqlsession.selectOne("Project.selectOneBoardProject", pb_no);
	}
	
	public int insertBoardFixProject(Project project) {
		return sqlsession.insert("Project.insertBoardFixProject", project);
	}
	
	public int deleteBoardFixProject(Project project) {
		return sqlsession.delete("Project.deleteBoardFixProject", project);
	}
	
	public int insertNoticeProject(Project project) {
		return sqlsession.insert("Project.insertNoticeProject", project);
	}
	
	public List<Project> selectListNoticeProject(Project project) {
		return sqlsession.selectList("Project.selectListNoticeProject", project);
	}
	
	public Project selectOneNoticeProject(Project project) {
		return sqlsession.selectOne("Project.selectOneNoticeProject", project);
	}
	
	public int insertWorkProject(Project project) {
		return sqlsession.insert("Project.insertWorkProject", project);
	}
	
	public List<Project> selectListWorkProject(Project project) {
		return sqlsession.selectList("Project.selectListWorkProject", project);
	}
	
	public List<Project> selectListSubWorkProject(int pw_no) {
		return sqlsession.selectList("Project.selectListSubWorkProject", pw_no);
	}
	
	public Project selectOneWorkProject(int pw_no) {
		return sqlsession.selectOne("Project.selectOneWorkProject", pw_no);
	}
	
	public List<Project> selectListWorkEmpProject(int pw_no) {
		return sqlsession.selectList("Project.selectListWorkEmpProject", pw_no);
	}
	
	public List<Project> selectListParticipantProject(int pr_no, String authority) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("pr_no", pr_no);
		map.put("pr_emp_authority", authority);
		return sqlsession.selectList("Project.selectListParticipantProject", map);
	}
	
	public List<String> selectListDeptProject(int pr_no, String authority) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("pr_no", pr_no);
		map.put("pr_emp_authority", authority);
		return sqlsession.selectList("Project.selectListDeptProject", map);
	}
	
	public int insertParticipantProject(Project project) {
		return sqlsession.insert("Project.insertParticipantProject", project);
	}
	
	public int updateParticipantProject(Project project) {
		return sqlsession.update("Project.updateParticipantProject", project);
	}
	
	public int deleteParticipantProject(Project project) {
		return sqlsession.update("Project.deleteParticipantProject", project);
	}
	
	public List<Project> selectListTodoProject(Project project) {
		return sqlsession.selectList("Project.selectListTodoProject", project);
	}
	
	public int insertTodoProjecet(Project project) {
		return sqlsession.insert("Project.insertTodoProjecet", project);
	}
}
