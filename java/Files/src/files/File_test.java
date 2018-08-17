package files;

import java.io.File;

public class File_test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		File cdirectory = new File("C:\\");
		File filelist[] = cdirectory.listFiles();
		for (int i = 0; i < filelist.length; i++) {
			if (filelist[i].isFile()) {
				System.out.println("[File]" + filelist[i].getName());
			}else if (filelist[i].isDirectory()) {
				System.out.println("[Directory]" + filelist[i].getName());
			}else {
				System.out.println("[?]" + filelist[i].getName());
			}
		}
	}

}
