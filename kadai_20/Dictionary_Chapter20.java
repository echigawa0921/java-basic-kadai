import java.util.HashMap;

public class Dictionary_Chapter20 {
	private HashMap<String, String> dictionary;
	
	public Dictionary_Chapter20() {
		dictionary = new HashMap<>();
		initializeDictionary();
	}
	
	private void initializeDictionary() {
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "なし");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
	}
	
	public void searchWord(String word) {
		if (dictionary.containsKey(word)) {
			System.out.println(word + "の意味は" + dictionary.get(word));
		} else {
			System.out.println(word + "は辞書には存在しません");
		}
	}
}
