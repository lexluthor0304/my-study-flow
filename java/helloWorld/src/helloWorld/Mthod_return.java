package helloWorld;

public class Mthod_return {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//int data[];
		test(15, 4);
		test(7, 9);

	}

	private static void test(int n1, int n2) {
		// TODO 自動生成されたメソッド・スタブ
		if (n2 == 0) {
			System.out.println("0で割ることはできません！");
			return;
		}
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}

}
