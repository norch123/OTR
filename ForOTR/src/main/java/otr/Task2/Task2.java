package otr.Task2;

import java.util.List;
import java.util.Scanner;

public class Task2 {
	
	 public static void main( String[] args ) {
	    	Scanner in = new Scanner(System.in);
	    	System.out.println("Введите фамилию: ");
	    	String name = in.nextLine();
	    	in.close();
	    	WorkWithPhoneBook wwpb = new WorkWithPhoneBook(InitPhoneBook.init());
	    	List<String> phoneNumbersList = wwpb.getPhoneNumbersByUsername(name);
	    	if(phoneNumbersList != null) {
	    		System.out.println(phoneNumbersList);
	    	} else {
	    		System.out.println("такого ФИО в БД нет");
	    	}
	    }
}
