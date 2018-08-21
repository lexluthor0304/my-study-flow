import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MakeNewCSV {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		String filename = "C:\\Users\\liu\\Desktop\\test.csv";
		try {
			FileWriter fw = new FileWriter(filename);
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/companydata", "root", "root");
			String query = "select * from empinfo";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				fw.append(rs.getString("empCd"));
				fw.append(',');
				fw.append(rs.getString("name"));
				fw.append(',');
				fw.append(rs.getString("birthday"));
				fw.append(',');
				fw.append(rs.getString("countryCd"));
				fw.append(',');
				fw.append(rs.getString("sexCd"));
				fw.append('\n');

			}
			fw.flush();
			fw.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
