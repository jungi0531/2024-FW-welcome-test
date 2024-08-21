package java_test;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n > 0) {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println(sum);
                break;
            }
            else {
                System.out.println("X");
            }
        }

        scanner.close();
    }

}