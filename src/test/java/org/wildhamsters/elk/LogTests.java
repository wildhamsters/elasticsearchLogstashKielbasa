package org.wildhamsters.elk;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogTests {

    @DataProvider
    public Object[][] testLogProvider() {
        return new Object[][] {
                { "", "", "", "", ""}
        };
    }

    @Test(dataProvider = "testLogProvider")
    public void testLogCreation(String level,
                                String timeStamp,
                                String microService,
                                String className,
                                String logMsg) {
        // Given
        Log testLog = new Log(level, timeStamp, microService, className, logMsg);
        SoftAssert softAssert = new SoftAssert();
        // When

        // Then
        softAssert.assertEquals(testLog.level(), "");
        softAssert.assertEquals(testLog.timeStamp(), "");
        softAssert.assertEquals(testLog.microService(), "");
        softAssert.assertEquals(testLog.className(), "");
        softAssert.assertEquals(testLog.logMsg(), "");
        softAssert.assertAll();
    }

}
