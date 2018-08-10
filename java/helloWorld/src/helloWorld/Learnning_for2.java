package helloWorld;

public class Learnning_for2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i; // 今のmethodであれば、どこでも使えるi
		for (i = 0; i <= 20; i+=3) { //最後の結果は２１だが、<=20の条件に反してるので、プリントできない
			System.out.println(i);
		}
		System.out.println("変数の値が" + i + "条件式がfalseとなりました。");
	}
}
