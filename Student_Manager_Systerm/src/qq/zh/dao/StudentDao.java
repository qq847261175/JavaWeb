package qq.zh.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import qq.zh.domain.Student;


public class StudentDao {

	static private DataSource source;
	static{
		Properties properties = new Properties();
		try {
			properties.load(new FileReader( StudentDao.class.getClassLoader().getResource("dbcp.properties").getPath()));
			source=BasicDataSourceFactory.createDataSource(properties);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Student findUserNameAndPsw(String id, String password) {
		Student stu=null;
			QueryRunner qr=new QueryRunner(source);
			try {
				 stu=qr.query("select * from t_student where id=? and password=?", new BeanHandler<Student>(Student.class), id,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return stu;
}

}