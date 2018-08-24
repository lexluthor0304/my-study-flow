import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertToDatabases {

	static String filePath = "C:\\Users\\user\\Desktop\\test.csv";
	static File file = new File(filePath);

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 CSVLoader();


	}

	
	private static CSVLoader(String[]) throws Exception {
		try {
			
			InputStreamReader osr = new InputStreamReader(new FileInputStream(file), "UTF-8");
			//　ファイルをバッファーに入れる
			BufferedReader br = new BufferedReader(osr);
			
			String line;
			
			// 一行ずつCSVファイルを読み込む
			
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",", -1); // 行をカンマで配列に変換
				
				for (String elements : data) {
					
					System.out.println(elements);
				}
			}
			
			br.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();
		}
		System.out.println("ファイル：　" + "\r\n" + filePath + "\r\n" + "の読み込み完了……異常なし！");
		
	}

}
