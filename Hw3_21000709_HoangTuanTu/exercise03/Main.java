package Hw3_21000709_HoangTuanTu.exercise03;

import java.util.Random;

public class Main {
    static Random random = new Random();
    static final int BOUND = (int) Math.pow(10, 6);

    public static List<Integer> generateList(){
        final int SIZE = random.nextInt((int) Math.pow(10, 2)) + 1;
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < SIZE; i++){
            if (random.nextBoolean()){
                result.add(random.nextInt(BOUND));
            }else {
                result.addBot(random.nextInt(BOUND));
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> list = generateList();
        System.out.println("Origin linkedList: ");
        System.out.println(list);

        System.out.println("\n_______________________");

        System.out.println("Test remove top");
        System.out.println("Top element: " + list.removeTop());
        System.out.println("List after remove: ");
        System.out.println(list);

        System.out.println("\n_______________________");

        System.out.println("Test remove bot");
        System.out.println("Bot element: " + list.removeBot());
        System.out.println("List after remove: ");
        System.out.println(list);


        System.out.println("\n_______________________");

        System.out.println("Test get");
        int index = random.nextInt(list.size() - 1);
        System.out.printf("Get element at index = %d: %d\n", index, list.get(index));

        System.out.println("\n_______________________");

        System.out.println("Test set");
        int data = random.nextInt(BOUND);
        list.set(index, data);
        System.out.printf("Set element at index = %d to %d\n", index, data);
        System.out.println("List after set: ");
        System.out.println(list);

        System.out.println("\n_______________________");

        System.out.println("Test remove");
        System.out.println("Size before remove: " + list.size());
        System.out.printf("Test remove all element have value = %d in list\n", data);
        list.removeValue(data);
        System.out.println("List after remove: ");
        System.out.println(list);
        System.out.println("Size after remove: " + list.size());
    }
}
