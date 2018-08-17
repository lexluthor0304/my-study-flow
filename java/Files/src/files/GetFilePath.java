package files;

import java.io.File;

public class GetFilePath {

	public static void main(String args[]) {
		// TODO 自動生成されたメソッド・スタブ
		// ディレクトリ指定
		String path = "C:\\";
		File dir = new File(path);

		//フルパスで取得
		System.out.println("-ファイル一覧（フルパス）-");
		File[] files1 = dir.listFiles();
		for (int i = 0; i < files1.length; i++) {
			File file = files1[i];
			if (files1[i].isFile()) {
				//ファイル名表示
				System.out.println(file);
			}else if (files1[i].isDirectory()) {
				//ディレクトリ名表示
				System.out.println(file);
			}
			}
		}
}