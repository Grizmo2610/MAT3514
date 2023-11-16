package Hw7_21000709_HoangTuanTu.excercise01.list;

public class ArrayList<E extends Comparable<E>> implements List<E>  {
	private int size = 0;
	private E[] container;

	public ArrayList() {
		container = (E[]) new Comparable[100];;
	}

	private void expand(){
		E[] temp = (E[]) new Comparable[container.length * 5];
		System.arraycopy(container, 0, temp, 0, size);
		container = temp;
	}
	@Override
	public void add(E data) {
		if (size >= container.length - 5){
			expand();
		}
		container[size] = data;
		size++;
	}

	@Override
	public void add(int index , E data) {
		if (size >= container.length - 5){
			expand();
		}
		for (int i = size; i > index; i--){
			container[i] = container[i-1];
		}
		container[index] = data;
		size++;
	}

	@Override
	public void remove(int index) {
		for (int i = index; i < size ;i++){
			container[i] = container[i + 1];
		}
		size--;
	}

	@Override
	public E get(int index) {
		return container[index];
	}

	@Override
	public void set(int index , E data) {
		container[index] = data;
	}

	@Override
	public boolean isContain(E data) {
		for (int i = 0; i < size; i++){
			if (container[i].equals(data)){
				return true;
			}
		}return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int indexOf(E value) {
		for (int i = 0; i < size; i++){
			if (container[i].equals(value)){
				return i;
			}
		}return -1;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < size;i++){
			result.append(container[i]);
			if (i < size - 1){
				result.append(", ");
			}
		}
		return result.append("]").toString();
	}
}
