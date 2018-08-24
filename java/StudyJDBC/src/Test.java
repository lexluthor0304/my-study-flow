import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

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
			Class.forName("com.mysql.cj.jdbc.Driver");//.newInstance();

			/*
			 * DriverManagerクラスのgetConnectionを使ってデータベースにアクセス
			 */
			con = DriverManager.getConnection(url, username, password);

			System.out.println("Connected......");

			Statement st = con.createStatement();

			String sqlStr = "SELECT empCd, name, birthday, country.countryName, sex.sexName FROM "
					+ "empinfo INNER JOIN sex on empinfo.sexCd = sex.sexCd "
					+ "INNER JOIN country on empinfo.countryCd = country.countryCd;";

			ResultSet result = st.executeQuery(sqlStr);
			
			try {
				FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\test.csv");
				String s1 = "社員番号";
				String s2 = "名前";
				String s3 = "生年月日";
				String s4 = "国籍";
				String s5 = "性別";
				fw.write(s1 + "," + s2 + "," + s3 + "," + s4 + "," + s5 + "\r\n");
				fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			while (result.next()) {
				String str1 = result.getString("empCd");
				String str2 = result.getString("name");
				String str3 = result.getString("birthday");
				String str4 = result.getString("country.countryName");
				String str5 = result.getString("sex.sexName");
				String all = str1 + "," + str2 + "," + str3 + "," + str4 + "," + str5;
				System.out.println(all);

				try {
					//FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\test.csv", true);
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
/* openCSV
	private void CSVHeaderWriter(String args[]) {
		// TODO 自動生成されたメソッド・スタブ
		File file = new File("C:\\Users\\userDesktop\\test.csv");

		try {
			FileWriter outputFile = new FileWriter(file);
			CSVWriter writer = new CSVWriter(outputFile, ',',
					CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER,
					CSVWriter.DEFAULT_LINE_END);
			
			List<String[]> data = new ArrayList<String>();
			data.add(new String[] {"社員番号","名前","生年月日","国籍","性別"});
			writer.writeAll(data);
			writer.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
*/
}