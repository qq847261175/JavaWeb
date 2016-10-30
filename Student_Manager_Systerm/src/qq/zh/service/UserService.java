package qq.zh.service;

import qq.zh.dao.StudentDao;
import qq.zh.domain.Student;

public class UserService {

	private StudentDao dao=new StudentDao();
	public Student findUserNameAndPsw(String username, String password) {
		Student stu= dao.findUserNameAndPsw(username,password);
		return stu;
	}

}
