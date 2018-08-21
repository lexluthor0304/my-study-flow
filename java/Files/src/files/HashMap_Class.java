package files;

import java.util.HashMap;

public class HashMap_Class {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String,String>map = new HashMap<String,String>();
		map.put("りんご", "apple");
		map.put("ぶどう", "grapes");

		if (map.containsKey("りんご")) {
			System.out.println("りんごを英語にすると");
			System.out.println(map.get("りんご"));
		}else {
			System.out.println("指定したキーは存在しません");
		}
	}

}
