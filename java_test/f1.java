package java_test;

import java.util.Scanner;

class Fan {
    private String model;
    private int price;

    public Fan() {}

    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class f1 {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner scanner = new Scanner(System.in);

        Fan[] fan = new Fan[3];
        for (int i = 0; i < 3; i++) {
            fan[i] = new Fan();
            fan[i].setModel(scanner.next());
            fan[i].setPrice(scanner.nextInt());
        }

        Fan result = fan[0];
        for (int i = 1; i < 3; i++) {
            if (result.getPrice() > fan[i].getPrice()) {
                result = fan[i];
            }
        }
        System.out.println(result.getModel());

        scanner.close();
    }

}