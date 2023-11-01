package Hw4_21000709_HoangTuanTu.exercise01;

import Hw4_21000709_HoangTuanTu.exercise02.ArrayStack;
import Hw4_21000709_HoangTuanTu.exercise02.LinkedListStack;
import Hw4_21000709_HoangTuanTu.exercise02.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Character> s     = new ArrayStack<>();
        String hoten = "hoangtuantu";
        for (int i = 0; i < hoten.length(); i++) {
            if (i % 2 == 0){
                s.push(hoten.charAt(i));
            }

            if (i % 3 == 0){
                s.pop();
            }
        }
        System.out.println(s);
        /*
        Input: "hoangtuantu"
        Output: {'g', 'u'*/
    }
}
