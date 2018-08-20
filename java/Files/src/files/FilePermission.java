package files;

import java.io.File;

public class FilePermission {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		File file = new File("c:/Users/liu/Desktop/test.txt");

		checkPermission(file);

		if (file.setReadOnly()) {
			System.out.println("ファイルを読み取り専用にした");
		}else {
			System.out.println("読み取り専用に変更が失敗した");
		}
		checkPermission(file);
	}
	private static void checkPermission(File file) {
		if (file.canRead()) {
			System.out.println("ファイルは読み取り可能");
		}

		if (file.canWrite()) {
			System.out.println("ファイルは書き込み可能");
		}
	}

}
