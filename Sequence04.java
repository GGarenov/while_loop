package whileLoop;

import java.util.Scanner;

public class Sequence04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;
        while (currentNum <= n){
            System.out.println(currentNum);
            currentNum = currentNum * 2 + 1;
        }
    }
}
