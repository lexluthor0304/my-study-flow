package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale.Category;

import com.mysql.jdbc.Connection;

public class TestToContentMySQL {

	public static void main(String args[]) {
		// TODO 自動生成されたメソッド・スタブ
		Connection conn = null;
		String url = "jdbc:mysql://localhost/school";
		String user = "root";
		String password = "root";

		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally{
			if(conn != null){
				conn.close();
			}
		}
	} catch (SQLException e){
		System.out.println(e.getErrorCode());
	}

}
