package Hw7_21000709_HoangTuanTu.excercise01.list;

public interface List<E extends Comparable<E>> {
	void add(E data);
	void add(int index, E data);
	void remove(int index);
	E get(int index);
	void set(int index, E data);
	boolean isContain(E data);
	int size();
	boolean isEmpty();
	int indexOf(E value);

}
