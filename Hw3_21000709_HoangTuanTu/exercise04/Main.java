package Hw3_21000709_HoangTuanTu.exercise04;

import Hw3_21000709_HoangTuanTu.exercise02.ArrayList;
import Hw3_21000709_HoangTuanTu.exercise02.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static String inputText(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input paragraph: ");
            return input.nextLine();
        }
    }

    public static String getText(String pathname){
        File file;
        try {
            file = new File(pathname);
            try (Scanner input = new Scanner(file)) {
                StringBuilder result = new StringBuilder();
                while (input.hasNext()){
                    result.append(input.next()).append(" ");
                }
                return result.toString();
            }
        } catch (FileNotFoundException e){
            System.out.println("Can't find file at " + pathname);
        }
        return "";
    }

    public static String[] preprocessing(String paragraph){
        System.out.println(paragraph);

        final String[] specialChar = {"(", ")", ",", ".", ":", "*", "?"};
        for (String string: specialChar){
            paragraph = paragraph.replace(string, "");
        }
        String[] result = paragraph.split(" ");
        for (int i = 0; i < result.length; i++){
            result[i] = result[i].trim().toLowerCase();
        }

        return result;
    }

    public static void printResult(List<WordCount> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static boolean selection(){
        try (Scanner input = new Scanner(System.in)) {
            int temp;
            while (true){
                try {
                    System.out.println("Input \"1\" for input data from keyboard");
                    System.out.println("Input \"2\" for input data from a file");
                    System.out.print("Your choice: ");
                    temp = input.nextInt();
                    if (temp != 1 && temp != 2){
                        System.out.println("Please only input 1 or 2!");
                    }
                    else{
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please only input 1 or 2!");
                }
            }
            return temp == 1;
        }
    }

    public static void main(String[] args) {
        String    paragraph;
        if (selection()){
            paragraph = inputText();
        }else {
            Scanner input = new Scanner(System.in);
            System.out.println("Input path of your file: ");
            String pathname = input.next();
            paragraph = getText(pathname).trim();
            input.close();
        }

        if(paragraph.length() > 1){
            String[]        strings = preprocessing(paragraph);
            List<WordCount> counts  = new ArrayList<>();
            for (String string : strings) {
                WordCount word  = new WordCount(string);
                int       index = counts.indexOf(word);
                if (index < 0){
                    counts.add(word);
                    word.count();
                } else {
                    counts.get(index).count();
                }
            }
            System.out.println("Word Count result: ");
            printResult(counts);
        }
        
    }
}
