package files;
import java.io.File;

public class FileList {

	public static void main(String args[]) {
		// TODO 自動生成されたメソッド・スタブ
		File cdirectory = new File("C:\\");

		String filelist[] = cdirectory.list();
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
	}

}
