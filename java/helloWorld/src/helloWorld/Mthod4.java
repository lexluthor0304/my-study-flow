package helloWorld;

public class Mthod4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num;
		String kekka;
		num = 9;
		kekka = hantei(num);
		System.out.println(num + "は" + kekka);
		num = 6;
		kekka = hantei(num);
		System.out.println(num + "は" + kekka);
	}

	private static String hantei(int n) {
		// TODO 自動生成されたメソッド・スタブ
		if (n % 2 == 0) {
			return "偶数";
		}else {
			return "奇数";
		}
	}

}
