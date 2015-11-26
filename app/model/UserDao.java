package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
//	public static void main (String[] args){
//		UserDao userDao = new UserDao();
//		userDao.connect();
//		User currentUser = userDao.getUser(100);
//		String t = currentUser.getFullName();
//		System.err.println(t);
//	}
	
	
	Connection conn = null;

	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "skazzi", "2202");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public User getUser(int user_id) {
		try {
			String query = "SELECT First_name, Last_name	FROM employees WHERE employee_id =" + user_id;

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();

			// Create obejct
			User u = new User();
			u.user_id = user_id;
			String first_name = rs.getString(1);
			String last_name = rs.getString(2);

			u.setFirstName(first_name);
			u.setLastName(last_name);

			st.close();
			rs.close();
			return u;

		} catch (SQLException e1) {
			System.out.println("Not found");
		}
		return null;
	}
}
