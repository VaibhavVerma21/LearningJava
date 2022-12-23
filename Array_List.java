import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

    //Video 24 "ArrayList"
    static void WrapperClass(){
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);
    }
    static void ArrayList(){
        // Initialized ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // add a new element
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);

        // get an element at index i
        System.out.println(arr.get(0));

        // print with for loop
        for(int i=0; i<arr.size(); i++)
            System.out.print(arr.get(i) + " ");
        System.out.println();

        // printing the array list directly
        System.out.println(arr);

        // adding elment at some index i
        arr.add(1,100);
        System.out.println(arr);

        // modifying element at index i
        arr.set(1, 200);
        System.out.println(arr);

        // removing an element at index i
        arr.remove(1);
        System.out.println(arr);

        // removing an element e
        arr.remove(Integer.valueOf(7));
        System.out.println(arr);
        arr.remove(Integer.valueOf(17));
        System.out.println(arr);

        // checking if an element exists
        System.out.println(arr.contains(Integer.valueOf(8)));
        System.out.println(arr.contains(Integer.valueOf(10)));

        // if you don't speicfy class, you can add anything in the arraylist
        ArrayList arr1 = new ArrayList();
        arr1.add("qprsee");
        arr1.add(1);
        arr1.add(true);
        System.out.println(arr1);


    }
    static void reverseArrayList(ArrayList<Integer> list){
        int size = list.size();
        for(int i = 0; i<size/2; i++){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(size-1-i));
            list.set(size-1-i, temp);
        }
        System.out.println("Reversed List = " + list);
    }
    static void reverseArrayList_InBuilt(ArrayList<Integer> list){
        Collections.reverse(list);
        System.out.println("Reversed List = " + list);
    }
    static void sortArrayList_InBuilt_Integer(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println("Ascending Order = " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order = " + list);
    }
    static void sortArrayList_InBuilt_String(ArrayList<String> list){
        Collections.sort(list);
        System.out.println("Ascending Sorted Order = " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Sorted Order = " + list);
    }

    public static void main(String[] args) {


    }
}
