package Hw3_21000709_HoangTuanTu.exercise04;

public class WordCount {
    private final String word;
    private int count = 0;

    public WordCount(String word) {
        this.word = word;
    }

    public void count(){
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WordCount otherWordCount = (WordCount) o;
        return word.equals(otherWordCount.word);
    }

    @Override
    public String toString(){
        return String.format("{%s: %d}", word, count);
    }
}
