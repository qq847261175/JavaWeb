package qq.zh.service;

import java.sql.SQLException;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;
import com.sun.xml.internal.bind.v2.model.core.ID;

import qq.zh.dao.CourseDao;
import qq.zh.domain.Course;
import qq.zh.domain.Student;

public class CourseService {

	private CourseDao dao= new CourseDao();
	public List<Course> findSelectedCourseListById(Student student) throws SQLException {
		// TODO Auto-generated method stub
		List<Course>list=dao.findSelectedCourseById(student);
		return list;
	}
	
	
	
	public List<Course> selectingCourseByStuId(Student stu) throws SQLException {
		return dao.selectingCourseByStuId(stu);
	}
	
	
	public boolean   checkCredit(Student stu,String courseid) throws SQLException{
		
		int credits=dao.getCreditByCourseId(courseid);
		List<Course>list =dao.findSelectedCourseById(stu);
		for (Course course : list) {
			credits+=course.getCredit();
		}
		return credits>15;
	}
	public boolean courseCheckIn(Student stu, String courseid) throws SQLException {
		// TODO Auto-generated method stub
		if (checkCredit(stu, courseid)) {
			return false;
		}	
		
		return dao.courseCheckIn(stu,courseid);
	}
}
