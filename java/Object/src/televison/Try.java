package televison;

public class Try {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n[] = {18, 29, 36};
		System.out.println("開始します");

		try {
			for (int i = 0; i < n.length; i++) {
				System.out.println(n[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("配列の範囲を超えています");

		}
		System.out.println("終了します");
	}

}
