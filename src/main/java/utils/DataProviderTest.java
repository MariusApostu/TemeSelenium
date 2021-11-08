package utils;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider(name = "testDataForProducts")
    public Object[][] testDataForProducts(){

        Object[][] data = new Object[2][2];

        data[0][0] = "Cooking with love";
        data[0][1] = "book11.jpg";

        data[1][0] = "Life in the garden";
        data[1][1] = "book4.jpg";

        return data;
    }

}
