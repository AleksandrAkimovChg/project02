package utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public final class TestUtils {

    public static String getRandomStr(int length) {

        return RandomStringUtils.random(length,
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
    }

    public static int getRandomNumbers(int length) {
        if (length == 2) {

            return (int) (Math.random() * 90 + 10);
        } else if (length == 3) {

            return (int) (Math.random() * 900 + 100);
        } else if (length == 4) {

            return (int) (Math.random() * 9000 + 1000);
        } else if (length == 5) {

            return (int) (Math.random() * 90000 + 10000);
        }

        return -1;
    }

    public static String capitalizeEachWordInString(String string) {
        String words[] = string.trim().toLowerCase().split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String s = StringUtils.capitalize(w);
            capitalizeWord+= s + " ";
        }

        return capitalizeWord.trim();
    }
}
