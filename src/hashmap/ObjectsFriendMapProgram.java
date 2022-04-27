package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ObjectsFriendMapProgram {

	private static Scanner input = new Scanner(System.in);
	private static Map<String, Friend> friendMap = new HashMap<String, Friend>();

	public static void main(String[] args) {

		int choice = getChoice();

		while (choice != 0) {

			if (choice == 1) {
				addFriend();
			} else if (choice == 2) {
				findFriend();
			} else if (choice == 3) {
				deleteFriend();
			} else if (choice == 4) {
				printFriends();
			} else {
				System.out.println("Please enter a number between 0 and 4");
			}
			choice = getChoice();
		}
		System.out.println("Bye!");
	}

	public static int getChoice() {

		int choice = -1;

		while (choice == -1) {
			try {
				System.out
						.print("1 = Add friend | 2 = Find friend | 3 = Delete friend | 4 = Print friends | 0 = Quit \n"
								+ "Enter choice: ");
				choice = Integer.parseInt(input.nextLine());

				if (choice >= 0 && choice <= 4) {

					return choice;

				} else {
					System.out.println("Please enter a number between 0 and 4");

					choice = -1;
				}

			} catch (NumberFormatException nfe) {

				System.out.println("Please enter a number between 0 and 4");

				choice = -1;
			}

		}

		return -1;
	}

	public static void addFriend() {

		System.out.print("Enter nickname: ");
		String nickname = input.nextLine();

		Friend findThis = friendMap.get(nickname);

		if (findThis != null) {

			System.out.println(nickname + " is already in use!");

		} else {

			System.out.print("Enter name: ");
			String name = input.nextLine();

			LocalDate localDate = null;

			while (localDate == null) {
				
				System.out.print("Enter birthdate (dd.mm.yyyy): ");
				String birthdate = input.nextLine();

				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

				try {
					localDate = LocalDate.parse(birthdate, formatter);
					
				} catch (DateTimeParseException e) {
					
					System.out.println("Invalid date: " + birthdate);
				}
			}
			
			Friend friend = new Friend(nickname, name, localDate);

			friendMap.put(friend.getNickname(), friend);

		}
	}

	public static void findFriend() {

		System.out.println("Enter nickname: ");
		String nickname = input.nextLine();

		Friend findFriend = friendMap.get(nickname);

		if (findFriend == null) {

			System.out.println(nickname + " not found!");
		} else {

			System.out.println(findFriend.toString());
		}
	}

	public static void deleteFriend() {

		System.out.println("Enter nickname: ");
		String nickname = input.nextLine();

		Friend findFriend = friendMap.get(nickname);

		if (findFriend == null) {

			System.out.println(nickname + " not found!");
		} else {

			friendMap.remove(nickname);

			System.out.println(nickname + " deleted!");
		}
	}

	public static void printFriends() {

		for (Friend friend : friendMap.values()) {

			System.out.println(friend);
		}
	}

}
