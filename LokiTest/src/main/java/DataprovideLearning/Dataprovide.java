package DataprovideLearning;

import org.testng.annotations.DataProvider;

public class Dataprovide {

	
	@DataProvider (name = "Dataprovide1")
	
	public Object[][] dataproviderdifferentclass(){
		return new Object[][] {
			{"Ten","Twenty"},
			{"one-Ten","one-20"}
		};
		
	}
}
