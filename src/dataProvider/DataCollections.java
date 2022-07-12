package dataProvider;

import org.testng.annotations.DataProvider;

public class DataCollections {
    @DataProvider(name = "TestDataForLogin")
    public Object[][] getData() {
        Object[][] data = {{"userName1", "pass1"}, {"userName2", "pass2"}};

        return data;
    }
}
