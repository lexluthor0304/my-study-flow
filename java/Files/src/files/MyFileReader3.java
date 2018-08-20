package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class MyFileReader3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			File file = new File("c:/Users/liu/Desktop/test.txt");

			if (checkBeforeWritefile(file)) {
				FileWriter fileWriter = new FileWriter(file, true);
				fileWriter.write("はい。元気です。\r\n");
				fileWriter.write("ではまた\r\n");

				fileWriter.close();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	private static boolean checkBeforeWritefile(File file) {
		// TODO 自動生成されたメソッド・スタブ
		if (file.exists()) {
			if (file.isFile()&&file.canWrite()) {
				return true;
			}
		}
		return false;
	}

}
