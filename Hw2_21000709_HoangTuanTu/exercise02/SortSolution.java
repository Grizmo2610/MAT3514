package Hw2_21000709_HoangTuanTu.exercise02;

public class SortSolution<T extends Comparable<T>> {
    Sort<T> solution;
    T[] numbers;
    boolean ascending = true;

    public SortSolution() {
    }

    public SortSolution(Sort<T> solution, T[] numbers, boolean ascending) {
        this.solution = solution;
        this.numbers = numbers;
        this.ascending = ascending;
    }

    public void setNewSort(Sort<T> solution, T[] numbers){
        this.solution = solution;
        this.numbers = numbers;
    }

    public void sort(){
        solution.sort(numbers);
    }

    public void sort(boolean ascending){
        solution.sort(numbers, ascending);
    }

    public void setSolution(Sort<T> solution) {
        this.solution = solution;
    }

    public void setNumbers(T[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++){
            result.append(numbers[i]);
            if (i < numbers.length - 1){
                result.append(", ");
            }
        }
        return result.toString();
    }
}
