package org.wildhamsters.elk;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tinylog.Logger;

@RestController
class LogController {
    @PostMapping("/log")
    Log newLogMsg(@RequestBody Log newLog) {

        String log = String.format("%s : %s microservice : %s class : %s", newLog.timeStamp(),
                newLog.microService(), newLog.className(), newLog.logMsg());
        switch (newLog.level().toUpperCase()) {
            case "ERROR" -> Logger.error(log);
            case "INFO" -> Logger.info(log);
            case "DEBUG" -> Logger.debug(log);
        }
        return newLog;
    }
}
