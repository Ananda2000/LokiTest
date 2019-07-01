package DataprovideLearning;

import org.testng.annotations.Test;

public class DataproviderInDiffClass {
	
	@Test(dataProvider ="Dataprovide1",dataProviderClass=Dataprovide.class)
	public void dataprovider1(String data11, String data22) {
		
		System.out.println("The data provider 1:- "+data11);
		System.out.println("The data provider 2:- "+data22);
		
	}

}
