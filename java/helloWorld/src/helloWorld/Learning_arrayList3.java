package helloWorld;

public class Learning_arrayList3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int seiseki[][] = {
				{68, 82, 92},
				{76, 33, 83},
				{92, 45, 38}
		};
		String kurasu[] = {"Aクラス", "Bクラス", "Cクラス"};
		for (int i = 0; i < kurasu.length; i++) {
			System.out.println("長さは" + seiseki.length);
			System.out.println(i + "----第一ループ");
			System.out.println(kurasu[i] + "成績");
			for (int j = 0; j < kurasu.length; j++) {
				System.out.println("長さは" + kurasu.length);
				System.out.println(j + "----第二ループ");
				System.out.println(seiseki[i][j]);
			}
		}
	}

}
