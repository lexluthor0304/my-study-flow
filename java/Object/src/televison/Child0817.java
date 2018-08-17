package televison;

public class Child0817 extends Parent0817{// Parentクラス（親クラス）を継承
	public String cs1 = "子クラスのメンバ変数が参照された。";

	public Child0817(){
		System.out.println("自クラスのコンストラクタ（引数なし）が呼ばれた。");

	}

	public void cm(){
		System.out.println("子クラスのメソッドが呼ばれた。");

	}
}
