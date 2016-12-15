package otr.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Введите первый ip");
		String ip1 = scanner.nextLine();
		System.out.println("Введите второй ip");
		String ip2 = scanner.nextLine();
		scanner.close();
		
		if(!checkIpOnValid(ip2) || !checkIpOnValid(ip1)) {
			throw new RuntimeException("ip not valid");
		}
		if(!checkNetwork(ip1, ip2)) {
			throw new RuntimeException("network addresses dont match");
		}
		
		List<String> resultList = getListIpForRange(ip1, ip2);
		System.out.println(resultList);
		
	}
	public static boolean checkIpOnValid(String ip){  
        Pattern p = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");  
        Matcher m = p.matcher(ip);  
        return m.matches();  
    }  
	
	public static List<String> getListIpForRange(String ipFrom, String ipTo) {
		String[] array1 = ipFrom.split("\\.");
		String[] array2 = ipTo.split("\\.");
		String networkAddr = getNetworkAddrByIp(ipFrom);
		List<String> listIp = new ArrayList<String>();
		int numberHostIp1 = Integer.parseInt(array1[3]);
		int numberHostIp2 = Integer.parseInt(array2[3]);
		for(int i = ++numberHostIp1; i < numberHostIp2; i++) {
			listIp.add(networkAddr + "." +i);
		}
		return listIp;
	}
	
	public static boolean checkNetwork(String ipFrom, String ipTo) {
		String networkAddr1 = getNetworkAddrByIp(ipFrom);
		String networkAddr2 = getNetworkAddrByIp(ipTo);
		return networkAddr1.equals(networkAddr2);
	}
	
	public static String getNetworkAddrByIp(String ip) {
		String[] array = ip.split("\\.");
		return array[0] + "." +array[1] + "." +array[2];
	}
}
