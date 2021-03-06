import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * localhost上のデータベースと接続し、取得したデータをコンソール出力する
 */


public class ConnectTest {

	public static void main(String args[]) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 接続先のサーバー名を"localhost"で与えることを示してる
		 */
		// String severname = "localhost";

		/*
		 * 接続するデータベース名をMySQLとしてる
		 */
		String databasename = "companydata";

		String username = "root";

		String password = "root";

		/*
		 * デフォルトencodeをUTF-8に指定
		 */

		//String severencoding = "UTF-8";

		/*
		 * データベースのURLを指定
		 */
		String url = "jdbc:mysql://localhost:3306/" + databasename + "?useUnicode=true&characterEncoding=utf-8";

		/*
		 * オブジェクトConnectionを初期化
		 */
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			/*
			 * DriverManagerクラスのgetConnectionを使ってデータベースにアクセス
			 */
			con = DriverManager.getConnection(url, username, password);

			System.out.println("Connected......");

			Statement st = con.createStatement();

			String sqlStr = "SELECT * FROM empinfo;";

			ResultSet result = st.executeQuery(sqlStr);

			while (result.next()) {
				String str1 = result.getString("empCd");
				String str2 = result.getString("name");
				String str3 = result.getString("birthday");
				String str4 = result.getString("countryCd");
				String str5 = result.getString("sexCd");
				String all = str1 + "," + str2 + "," + str3 + "," + str4 + "," + str5;
				System.out.println(all);

				try {
					//FileWriter fw = new FileWriter("C:\\Users\\liu\\Desktop\\test.csv", true);
					PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\user\\Desktop\\test.csv", true), "utf-8")));

					pw.println(all);
					pw.close();
				} catch (IOException e) {
					StackTraceElement[] stackTrace = null;
					// TODO: handle exception
					e.setStackTrace(stackTrace);
					e.printStackTrace();
				}
			}
			System.out.println("出力完了！");

			result.close();

			st.close();

			con.close();

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Connection Failed : " + e.toString());

			throw new Exception();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("ドライバーを読み込めませんでした " + e);
		}
		finally{
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception2! : " + e.toString());
			}
		}
	}
/*
	private void CSVHeaderWriter(String ags) {
		// TODO 自動生成されたメソッド・スタブ
		File file = new File("C:\\Users\\userDesktop\\test.csv");

		try {
			FileWriter outputFile = new FileWriter(file);
			CSVWriter writer = new CSVWriter(outputFile);

		} catch (IOException e) {
			// TODO: handle exception
		}
	}
*/
}
