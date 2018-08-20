package files;

import java.io.File;

public class Del_file {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		File newFile = new File("C:/Users/liu/Desktop/test.txt");

		if (newFile.exists()) {
			if (newFile.delete()) {
				System.out.println("ファイル削除成功");
			}else {
				System.out.println("ファイル削除失敗");
			}
		}else {
			System.out.println("ファイル見つからない");
		}
	}
}
