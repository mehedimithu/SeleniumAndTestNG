package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "TestDataForLogin", dataProviderClass = DataCollections.class)
    public void loginTest(String userName, String password) {

        System.out.println(userName+"  "+password);
    }


}
