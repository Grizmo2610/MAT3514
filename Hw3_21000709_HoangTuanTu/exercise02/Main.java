package Hw3_21000709_HoangTuanTu.exercise02;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = ArrayList.generateIntegerArrayList(100);
        System.out.println("List Integer: " + list);
        System.out.println("Size of list: " + list.size());

        list.add(5, 26);
        System.out.println("Add 26 at index 5: " + list);

        list.remove(5);
        System.out.println("Remove element at index 5: " + list);

        final int REMOVE_INTEGER = 200;
        if (list.isContain(REMOVE_INTEGER)){
            list.remove(REMOVE_INTEGER);
            System.out.println("Size of list after remove: " + list.size());
        }
        Iterator<Integer> integerIterator = list.iterator();
        System.out.println("Integer Iterator: ");
        while (integerIterator.hasNext()){
            System.out.print(integerIterator.next() + " ");
        }
    }
}
