package files;

import java.io.File;

public class Mkdir {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		File newFile = new File("d:\\Users\\liu\\Desktop\\test");
		try {
			if (newFile.mkdirs()) {
				System.out.println("ディレクトリ作成成功。");
			}else {
				System.out.println("ディレクトリ作成失敗");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
