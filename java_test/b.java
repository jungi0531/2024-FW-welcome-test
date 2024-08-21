package java_test;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if (input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u")) {
            System.out.println("O");
        }
        else {
            System.out.println("X");
        }

        scanner.close();
    }

}