package otr.test.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import otr.Task2.User;

public class InitPhoneBookForTest {

	public static Map<User, List<String>> init() {
		Map<User, List<String>> phoneBook = new HashMap<User, List<String>>();
		List<String> phoneNumber1 = new ArrayList<String>();
		phoneNumber1.add("+8 800 2000 500");
		phoneNumber1.add("+8 800 200 600");
		phoneBook.put(new User("Иванов И.И."), phoneNumber1);

		List<String> phoneNumber2 = new ArrayList<String>();
		phoneNumber2.add("+8 800 2000 700");
		phoneBook.put(new User("Петров П.П."), phoneNumber1);

		List<String> phoneNumber3 = new ArrayList<String>();
		phoneNumber3.add("+8 800 2000 800");
		phoneNumber3.add("+8 800 2000 900");
		phoneNumber3.add("+8 800 2000 000");
		phoneBook.put(new User("Сидоров С.С."), phoneNumber1);

		return phoneBook;
	}
}
