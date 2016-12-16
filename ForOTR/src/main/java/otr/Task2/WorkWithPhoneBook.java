package otr.Task2;

import java.util.List;
import java.util.Map;

public class WorkWithPhoneBook {
	private  Map<User, List<String>> phoneBook;
	
	public WorkWithPhoneBook( Map<User, List<String>> phoneBook) {
		this.phoneBook = phoneBook;
	}

	public List<String> getPhoneNumbersByUsername(String name) {
    	List<String> list = phoneBook.get(new User(name));
    	return list;
	}
}
