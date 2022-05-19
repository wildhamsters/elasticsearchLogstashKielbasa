package org.wildhamsters.elk;

record Log(String level, String timeStamp, String microService, String className, String logMsg) {}
