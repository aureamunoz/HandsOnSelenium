package org.duchess.selenium;


public class Util {
    public final static String getPath() {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        return "file://" + currentDir + "/website-test/";
    }
}
