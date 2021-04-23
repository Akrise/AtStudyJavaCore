package lesson2;

import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        String[][] testCases = {{"hello", "world"}, {"ping", "pong"}, {"qwer", "asdf"}, {"post", "get"}};
        for (String[] inputPair : testCases) {
            System.out.println(stringInteractions(inputPair));

        }
    }

    private static String stringInteractions(String[] inputPair) {
        char[] charOutput = new char[26];
        int j = 0;
        for (int i = 0; i < inputPair[1].length(); i++) {
            if (inputPair[0].contains(String.valueOf(inputPair[1].charAt(i))) && !String.valueOf(charOutput).contains(String.valueOf(inputPair[1].charAt(i))) ) {
                charOutput[j] = inputPair[1].charAt(i);
                j++;
            }
        }
        Arrays.sort(charOutput);
        return  String.valueOf(charOutput);
    }

}
