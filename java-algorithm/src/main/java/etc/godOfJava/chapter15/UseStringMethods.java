package etc.godOfJava.chapter15;

import java.util.Locale;

public class UseStringMethods {
    public static void main(String[] args) {
        String str = "The String class represents character strings";
        UseStringMethods useStringMethods = new UseStringMethods();
//        useStringMethods.printWords(str);
//        useStringMethods.findString(str, "string");
//        useStringMethods.findAnyCaseString(str, "string");
//        useStringMethods.countChar(str, 's');
        useStringMethods.printContainWords(str, "ss");
    }

    public void printWords(String str) {
        String[] strings = str.split(" ");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public void findString(String str, String findStr) {
        int index = str.indexOf(findStr);
        System.out.println("string is appeared at " + index);
    }

    public void findAnyCaseString(String str, String findStr) {
        String s = str.toLowerCase(Locale.ROOT);
        int index = s.indexOf(findStr);
        System.out.println("string is appeared at " + index);
    }

    public void countChar(String str, char c) {
        char[] chars = str.toCharArray();
        int count = 0;

        for (char data : chars) {
            if (data == c) {
                count += 1;
            }
        }
        System.out.println("char '" + c + "' count is " + count);
    }

    public void printContainWords(String str, String findStr) {
        String[] words = str.split(" ");
        for (String tempStr : words) {
            if (tempStr.contains(findStr)) {
                System.out.println(tempStr + " contains " + findStr);
            }
        }
    }
}
