package java_test;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            result += input.charAt(input.length() - (i + 1));
        }
        System.out.println(result);

        scanner.close();
    }

}