package otr.test.Task2;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import org.junit.Test;
import otr.Task2.WorkWithPhoneBook;

public class TestTask2 {
	
	@Test
	public void test_getPhoneNumbersByUsername() {
		String name = "Иванов И.И.";
		List<String> phoneNumber1 = new ArrayList<String>();
		phoneNumber1.add("+8 800 2000 500");
		phoneNumber1.add("+8 800 200 600");
		
    	WorkWithPhoneBook wwpb = new WorkWithPhoneBook(InitPhoneBookForTest.init());
        List<String> phoneNumbersList= wwpb.getPhoneNumbersByUsername(name);
	
		Assert.assertEquals(phoneNumber1,phoneNumbersList);
	}
}
