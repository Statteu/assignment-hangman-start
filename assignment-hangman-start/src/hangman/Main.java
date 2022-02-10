package hangman;

import java.lang.Object;
import java.lang.StringBuilder;

public class Main {
	public static void main(String[] args) {
		WordReader file = new WordReader("words.txt");
		System.out.println(file.getWord());
		StringBuilder a = new StringBuilder("wofijeowijfo");
		a.append("le");
		System.out.println((a));
	}
}
