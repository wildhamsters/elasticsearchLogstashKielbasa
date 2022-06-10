package org.wildhamsters.elk;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogControllerTests {

    @Test
    public void test() {
        // Given
        Log testLog1 = new Log("ERROR", "time", "micro-service", "class", "message");
        Log testLog2 = new Log("INFO", "time", "micro-service", "class", "message");
        Log testLog3 = new Log("DEBUG", "time", "micro-service", "class", "message");
        Log testLog4 = new Log("", "time", "micro-service", "class", "message");
        LogController testLogController = new LogController();
        SoftAssert softAssert = new SoftAssert();
        // When
        Log resultLog1 = testLogController.newLogMsg(testLog1);
        Log resultLog2 = testLogController.newLogMsg(testLog2);
        Log resultLog3 = testLogController.newLogMsg(testLog3);
        Log resultLog4 = testLogController.newLogMsg(testLog4);
        // Then
        softAssert.assertEquals(testLog1, resultLog1);
        softAssert.assertEquals(testLog2, resultLog2);
        softAssert.assertEquals(testLog3, resultLog3);
        softAssert.assertEquals(testLog4, resultLog4);
        softAssert.assertAll();
    }

}
