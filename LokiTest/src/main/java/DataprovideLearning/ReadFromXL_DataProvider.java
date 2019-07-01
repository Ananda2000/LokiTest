package DataprovideLearning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadFromXL_DataProvider {
	
	@Test(dataProvider="xxx")
	public void readfromdataprovider(String un,String pw) {
		
		System.out.println("The user name"+un);
		System.out.println("The password :"+pw);
		
	}
	
	@DataProvider (name ="xxx")
	
	public Object[][] dataproviderS() throws Exception{
		
		//C:\Anand\WS_2018-09\LokiTest\src\main\java\testData\login.xlsx
		Object[][] tt = xlprovider.getTableArray("C:/Anand/login.xlsx", "Sheet1");
		
		return tt;
	}

}
