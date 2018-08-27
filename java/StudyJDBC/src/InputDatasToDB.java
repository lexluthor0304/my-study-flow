import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InputDatasToDB {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filePath = "C:\\Users\\user\\Desktop\\test.csv";
		 //File file = new File(filePath);
		

		
		BufferedReader buffer = bufferedReader(filePath);
		
		try {
			CSVLoader(buffer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static BufferedReader bufferedReader(String file) {
		
		try {
			// buffere
			FileInputStream input = new FileInputStream(file);
			
			InputStreamReader stream = new InputStreamReader(input, "UTF-8");
			
			BufferedReader buffer = new BufferedReader(stream);
			
			return buffer;
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}	
		
	}
	
	public static void CSVLoader(BufferedReader buffer) throws Exception {
		
			
			String line;
			
			line = buffer.readLine();
			
			
			int flg = 0;
			int flg2 = 0;
			int count = 0;
			int i = 0;
			
			Connection con = null;
			con =  ConnectDB();
			
			while ((line = buffer.readLine()) != null) {
				String[] columns = line.split(",", 0); // 行をカンマで配列に変換
				count++;
				
				
				int len1 = columns.length;
				
				
				
				//Pattern p1 = Pattern.compile("^[0-9]+$");
				
				//System.out.println("counter : " + count);
				
				//for (String elements : columns) {
					
					System.out.println(columns[0]);	
					
					if (!columns[0].matches("^[0-9]+$")) {
						flg2++;
						
						continue;
					}

					
					if (len1 != 5) {
						flg++;
						continue;
					}
					
					// insert data to DB
					// throws SQLexception
					// make a counter
					
					

					InsResource(con, line);
					i++;

						
					System.out.println("Connected......Insert now......");
						
					System.out.println(i + "行のデータをインポートした。");
						
						
					
					
			}
			
			
			System.out.println(flg2 + "行社員番号は数字ではない");
			System.out.println(flg + "行項目足りない");
			//input.close();
			//stream.close();
			buffer.close();
			
		}
	
	private static Connection ConnectDB() throws SQLException {
		
		try {
			String databasename = "companydata";
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/" + databasename;
			Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			return con;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
		
	}

	private static void InsResource(Connection con, String line) {
		// TODO Auto-generated method stub
		String empCd = line.split(",")[0];
		String name = line.split(",")[1];
		String birthday = line.split(",")[2];
		String countryCd = line.split(",")[3];
		String sexCd = line.split(",")[4];
		
		String insStatement = "INSERT INTO empinfo VALUES(?,?,?,?,?)";
		
		try {
			PreparedStatement prepStmt = con.prepareStatement(insStatement);
			
			prepStmt.setString(1, empCd);
			prepStmt.setString(2, name);
			prepStmt.setString(3, birthday);
			prepStmt.setString(4, countryCd);
			prepStmt.setString(5, sexCd);
			
			int num = prepStmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("SQLException:" + e.getMessage());
			System.out.println("	SQLState:" + e.getSQLState());
			System.out.println("VendorError" + e.getErrorCode());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	


}
	