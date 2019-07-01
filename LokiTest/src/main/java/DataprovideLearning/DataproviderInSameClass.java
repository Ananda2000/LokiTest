package DataprovideLearning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderInSameClass {
	
	@DataProvider (name ="Data-provide")
	public Object[][] dataproviderMethod(){
		return new Object[][]{
			{"one","Two"},
			{"Three","Four"}
		};
		
	}
	
	@Test(dataProvider="Data-provide")
	public void Testmethod1 (String data1, String data2) {
		System.out.println("The 1st data :"+data1);
		System.out.println("The 2nd data :"+data2);
		
	}

}
