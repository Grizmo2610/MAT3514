package Hw4_21000709_HoangTuanTu.practice1;

import Hw4_21000709_HoangTuanTu.stack.Stack;

import java.util.Scanner;

public class Id13 {
    public static void solution(){
        Scanner input       = new Scanner(System.in);
        String  inputString = input.nextLine();
        Stack   container   = new Stack();
        for (char c: inputString.toCharArray()){
            container.push(c);
        }
        while (!container.isEmpty()){
            System.out.print(container.pop());
        }
    }
}
