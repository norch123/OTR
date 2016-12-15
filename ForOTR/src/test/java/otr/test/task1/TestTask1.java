package otr.test.task1;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import otr.Task1.Task1;

public class TestTask1 {

	@Test
	public void test_checkIpOnValid() {
		Assert.assertTrue(Task1.checkIpOnValid("192.168.0.1"));
		Assert.assertFalse(Task1.checkIpOnValid("192.145"));
	}
	
	@Test
	public void test_checkNetwork() {
		Assert.assertTrue(Task1.checkNetwork("192.168.0.1", "192.168.0.7"));
		Assert.assertFalse(Task1.checkNetwork("192.168.0.1", "192.168.10.7"));
	}
	
	@Test
	public void test_getNetworkAddrByIp() {
		String networkAddr = "192.168.0";
		Assert.assertEquals(networkAddr, Task1.getNetworkAddrByIp("192.168.0.3"));
	}
	
	@Test
	public void test_getListIpForRange() {
		List<String> list = new ArrayList<String>();
		list.add("192.168.0.5");
		list.add("192.168.0.6");
		list.add("192.168.0.7");
		Assert.assertEquals(list, Task1.getListIpForRange("192.168.0.4", "192.168.0.8"));
	}
	
}
