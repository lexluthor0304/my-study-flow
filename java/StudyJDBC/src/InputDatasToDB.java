import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputDatasToDB {
	
	static String filePath = "C:\\Users\\user\\Desktop\\test.csv";
	static File file = new File(filePath);
	
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CSVLoader();
		
	}
	
	public static void CSVLoader() {
		try {
			FileInputStream input = new FileInputStream(file);
			
			InputStreamReader stream = new InputStreamReader(input, "UTF-8");
			
			BufferedReader buffer = new BufferedReader(stream);
			
			String line;
			
			line = buffer.readLine();
			
			
			int flg = 0;
			int flg2 = 0;
			
			while ((line = buffer.readLine()) != null) {
				String[] columns = line.split(",", 0); // 行をカンマで配列に変換
				count++;
				
				int len1 = columns.length;
				
				
				
				//Pattern p1 = Pattern.compile("^[0-9]+$");
				
				//System.out.println("counter : " + count);
				
				for (String elements : columns) {
					
					System.out.println(columns);	
					
					if (!columns[0].matches("^[0-9]+$")) {
						flg2++;
						
						continue;
					}
				//}
					if (len1 < 5) {
						flg++;
						continue;
					}
					
					
				
			}
			System.out.println(flg2 + "行社員番号は数字ではない");
			System.out.println(flg + "行項目足りない");
			input.close();
			stream.close();
			buffer.close();
			
		}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();
		}
	}
	
}
	