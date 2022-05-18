package org.wildhamsters.elk;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tinylog.Logger;

@RestController
class LogController {

    @PostMapping("/log")
    Log newLogMsg(@RequestBody Log newLog) {
        Logger.info(newLog.logMsg());
        return newLog;
    }

}
