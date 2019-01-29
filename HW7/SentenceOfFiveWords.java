
public class SentenceOfFiveWords {

	public static String longestWord(String[] words) {
		if (words.length == 0) {
			return "words.length == 0";
		}
		int maxLength = words[0].length();
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > maxLength) {
				maxLength = words[i].length();
			}
		}
		StringBuilder sb = new StringBuilder("The longest words are:");
		for(String word: words) {
			if (word.length() == maxLength) {
				sb.append(", ").append(word);
			}
		}
		sb.deleteCharAt(sb.indexOf(","));
		sb.append(".");
		return sb.toString();
	}

	public static void main(String[] args) {
		String sentence = "London is a capital of Great Britain";

		String[] words = sentence.split(" ");

		for (String word : words) {
			System.out.println(word);
		}

		System.out.println(longestWord(words));
	}
}
