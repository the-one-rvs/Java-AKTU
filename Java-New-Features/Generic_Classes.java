import java.util.*;
class My_Class{
    int[] arr=new int[10];
}
class My_Class2<T> {
//    T[] arr = new T[10];
    private T[] arr;
    @SuppressWarnings("unchecked")
    public My_Class2() {
        // Creating a generic array using casting
        arr = (T[]) new Object[10];
    }
    public void add(int ind,T dig){
        arr[ind] = dig;
    }
    public T get(int ind){
        return arr[ind];
    }
}
public class Generic_Classes {
    public static void main(String[] args) {
        My_Class2<Integer> arr = new My_Class2<>();
        arr.add(2,9);
        arr.add(0,5);
        System.out.println(arr.get(0));
        System.out.println(arr.get(2));
    }
}
