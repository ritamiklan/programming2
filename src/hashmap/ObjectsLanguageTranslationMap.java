package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ObjectsLanguageTranslationMap {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		
		Map<String, String> wordPairMap = new HashMap<String, String>();

		boolean notOk = true;

		while (notOk == true) {

			System.out.print("Enter an English word: ");
			String englishWord = input.nextLine();

			if (englishWord.equals("ok")) {

				notOk = false;

			} else {

				System.out.print("Enter a Finnish word: ");
				String finnishWord = input.nextLine();

				wordPairMap.put(englishWord, finnishWord);

				System.out.println();
			}

		}

		System.out.println();

		System.out.println("=== English-Finnish translation service (quit ends) ===");

		boolean quit = false;

		boolean found = false;

		while (quit == false) {

			System.out.print("Enter an English word: ");
			String translateThis = input.nextLine();

			if (translateThis.equals("quit")) {

				System.out.println("Bye!");

				quit = true;

			} else {

				found = false;

	
				String whatever = wordPairMap.get(translateThis);
				
				 if (whatever != null) {
						
						System.out.println(wordPairMap.get(translateThis));


						System.out.println();

						found = true;

				 }

				
				if (quit == false && found == false) {

					System.out.println("Unknown word");

					System.out.println();

				}
			}
		}

		input.close();
	}
}
