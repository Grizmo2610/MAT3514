```java
public class Heap{
    public void insert(Node p, int value){
        if (p.parent.val > value){
            insert(p.parent, value);
            p.val = p.parent.val;
        }
    }
}


public class ArrayHeap{
    private int[] T;
    private int size = 0;
    public void insert(int value){
        if (tree[size - 1]){
            expand();
        }
        int p = size - 1, t = size * 2 + 1;
        while (tree[p] < tree[t]){
            int temp = tree[t];
            tree[t] = tree[p];
            tree[p] = temp;
            t = p;
            p = (p - 1)/ 2;
        }
        
    }
    
    public int removeMin(){
        swap(size, 0);
        tree[size] = null;
        size -= 1;
        int i = 1;
        while (i < n){
            if (2 * i + 1 < n){
                if (T[i] < T[2 * i] && T[i] < T[2 * i + 1])
                    return temp;
                else {
                    int j = 2 * i;
                    if (T[2 * i] > T[2 * i + 1]){
                        j ++;
                    }
                    i = j;
                }
            }
            else{
                if (2 * i < n){
                    if (T[i] > T[2 * i]){
                        Swap (T[i], T[2 * i]);
                    }
                }
                    return temp;
            }
        }
        return temp;
    }
}
```****