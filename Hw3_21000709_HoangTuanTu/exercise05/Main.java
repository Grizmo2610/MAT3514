package Hw3_21000709_HoangTuanTu.exercise05;

import java.util.Random;

public class Main {
    static Random     random     = new Random();;
    public static void linkedListExercises(){
        LinkedList list = new LinkedList();
        final int BOUND = (int) Math.pow(10, 6);
        int        size       = random.nextInt((int) Math.pow(10, 2)) + 1;
        for (int i = 0; i < size; i++){
            list.add(random.nextInt(BOUND));
        }

        System.out.println("Origin linked list: ");
        System.out.println(list);

        System.out.println("________________________");

        int index = random.nextInt(size - 1);
        int data = random.nextInt(BOUND);
        list.insert(index, data);
        System.out.printf("Insert %d at %d:\n", data, index);
        System.out.println(list);

        System.out.println("________________________");

        list.remove(index);
        System.out.printf("Remove %d:\n", data);
        System.out.println(list);

        System.out.println("________________________");

        int index1 = random.nextInt(size - 1);
        System.out.printf("Element at %d: %d\n", index1, list.get(index1));

        System.out.println("________________________");

        int index2 = random.nextInt(size - 1);
        int data2 = list.get(index2);
        int newData = random.nextInt(BOUND);
        list.replace(data2, newData);
        System.out.printf("Convert %d(index = %d) to %d\n", data2, index2, newData);
        System.out.println(list);

        System.out.println("________________________");

        int index3 = random.nextInt(size);
        int data3 = list.get(index3);
        list.removeBigger(index3);
        System.out.printf("Remove all element bigger than %d:\n", data3);
        System.out.println(list);

    }

    public static void dualLinkedListExercise(){
        DualLinkedList list = new DualLinkedList();
        final int BOUND = (int) Math.pow(10, 3);
        final int SIZE = random.nextInt(BOUND) + 2;
        System.out.println("Origin list: ");
        for (int i = 0; i < SIZE; i++){
            list.add(i + 1);
            if (i != 0){
                list.insert(0, i + 1);
            }
        }
        System.out.println(list);

        System.out.println("________________________");

        int index1 = random.nextInt(SIZE - 1);
        int data1 = random.nextInt(BOUND);
        System.out.printf("Insert %d at index %d: \n", data1, index1);
        list.insert(index1, data1);
        System.out.println(list);

        System.out.println("________________________");

        int index2 = random.nextInt(SIZE-1);
        list.get(index2);
        System.out.printf("Get element at index %d: %d\n", index2, list.get(index2));

    }

    public static void main(String[] args) {
        System.out.println("LinkedList Exercises: ");
        linkedListExercises();

        System.out.println("\n________________________\n");

        System.out.println("DualLinkedList Hw3_21000245_NguyenThiHaPhuong.Exercise: ");
        dualLinkedListExercise();
    }
}
