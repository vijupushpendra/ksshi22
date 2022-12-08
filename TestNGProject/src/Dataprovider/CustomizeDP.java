package Dataprovider;

import org.testng.annotations.DataProvider;

public class CustomizeDP {
	@DataProvider(name="loginCredentials")
	public Object[][] getData()
	{
		Object[][] data= {{"vijupushpendra@gmail.com","123"},{"Kush@gmail.com","456"}};
		return data;
		
	}

}
