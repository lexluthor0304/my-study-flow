package helloWorld;

public class Trim {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "  Good Morning   ";
		String new_str1 = str1.trim();
		System.out.println("元の文字列 「" + str1 + "」");
		System.out.println("文字列数は"+ str1.length() + "です。");
		System.out.println("空白を取り除いた文字列 ： " + new_str1.length());
		System.out.println("空白を取り除いた文字列の数は" + new_str1);
	}

}
