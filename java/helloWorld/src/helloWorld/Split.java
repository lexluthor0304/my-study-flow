package helloWorld;


public class Split {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "りんご、レモン、スイカ、ぶどう";
		String[] fruits = str.split("、");

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(i + "番目の要素 = " + fruits[i]);
		}
	}

}
