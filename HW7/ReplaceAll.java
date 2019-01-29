
public class ReplaceAll {

	public static void main(String[] args) {
		String sentence = "I   am      learning      Java Core";
		System.out.println(sentence.replaceAll("\\s{2,}", " "));
		System.out.println(sentence.replaceAll(" +", " "));
		System.out.println(sentence.replaceAll("[ ]+", " "));
	}

}
