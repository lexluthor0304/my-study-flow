package helloWorld;

public class Learning_length {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "腕時計";
		System.out.println("文字列の長さは" + str.length());
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
	}

}
