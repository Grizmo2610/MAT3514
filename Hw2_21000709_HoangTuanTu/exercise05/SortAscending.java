package Hw2_21000709_HoangTuanTu.exercise05;

import Hw2_21000709_HoangTuanTu.exercise01.QuickSort;
import Hw2_21000709_HoangTuanTu.exercise01.SortSolution;
import Hw2_21000709_HoangTuanTu.exercise01.Statistics;
import Hw2_21000709_HoangTuanTu.exercise01.Sort;

public class SortAscending {
    public static void main(String[] args) {
        int[] numbers   = Statistics.initializeArray(100);
        Sort quickSort = new QuickSort();
        SortSolution solution  = new SortSolution(quickSort, numbers, true, false);
        System.out.println("Array number is: " + solution);
        solution.sort();
        System.out.println("Array after sort ascending: " + solution);
        solution.sort(false, false);
        System.out.println("Array after sort descending: " + solution);
    }

}
