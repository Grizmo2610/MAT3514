package Hw4_21000709_HoangTuanTu.practice1;

import Hw4_21000709_HoangTuanTu.stack.Stack;

import java.util.Scanner;

public class Id14 {
    public static void solution(){
        Scanner scanner = new Scanner(System.in);
        int     n       = scanner.nextInt();

        Stack binaryStack = new Stack();

        while (n > 0) {
            int remainder = n % 2;
            binaryStack.push(remainder);
            n /= 2;
        }

        while (!binaryStack.isEmpty()) {
            System.out.print(binaryStack.pop());
        }
    }
}
