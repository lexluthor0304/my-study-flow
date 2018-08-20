package files;

import java.util.ArrayList;

public class ArrayList_Class {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> array = new ArrayList<String>();
		array.add("日本");
		array.add("ブラジル");
		array.add("イングランド");
		array.add("ポルトガル");
		array.add("フランス");
		String country = array.get(2);
		System.out.println(country);

	}

}
