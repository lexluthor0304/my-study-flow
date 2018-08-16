package helloWorld;

public class ReplaceFirst {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "今日の天気は晴れでした。明日の天気は晴れです。";
		System.out.println("元の文字列：");
		System.out.println(str);

		str = str.replaceFirst("晴れ", "雨");

		System.out.println("変換後");
		System.out.println(str);

		str = str.replaceAll("晴れ", "雨");

		System.out.println("すべて変更");
		System.out.println(str);
	}

}
