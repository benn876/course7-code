package org.fasttrackit.course7.code.staticCode;

public class StringUtils {
    public static String[] splitString(String stringToSplit, String tokenForSplit){
        return stringToSplit.split(tokenForSplit);
    }
}
