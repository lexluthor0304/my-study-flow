package files;

import java.io.File;

public class CreatwNewFile {

	public static void main(String args[]) {
		// TODO 自動生成されたメソッド・スタブ
		File newfile = new File("c:/Users/liu/Desktop/test.txt");
		try {
			if (newfile.createNewFile()) {
				System.out.println("ファイル作成成功！");
			}else {
				System.out.println("ファイル作成失敗した！");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("問題は" + e.getMessage());
		}
	}

}
