package helloWorld;

public class Upper_and_Lower {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "Good Morning";
		String upper_str1 = str1.toUpperCase();
		String lower_str1 = str1.toLowerCase();
		System.out.println("元の文字列 : " + str1);
		System.out.println("大文字変換 : " + upper_str1);
		System.out.println("小文字変換 : " + lower_str1);
		String str2 = "現在 A.M. 3時20分です。";
		String upper_str2 = str2.toUpperCase();
		String lower_str2 = str2.toLowerCase();
		System.out.println("元の文字列 : " + str2);
		System.out.println("大文字変換 : " + upper_str2);
		System.out.println("小文字変換 : " + lower_str2);
	}

}
