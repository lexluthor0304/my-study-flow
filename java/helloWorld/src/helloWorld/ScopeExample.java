package helloWorld;

public class ScopeExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 0;
		int b = 1;
		{
			int c = 2;
			int d = 3;
			System.out.println("a: " + a);
		}
		{
			int e = 4;
			int f = 5;
			System.out.println("b: " + b);
//			System.out.println("c: " + c); //	Cは前のブロック内の変数なので、使えない
		}
	}

}
