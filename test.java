import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        // Video 35
        // wanted to test if will iterating through the arraylist and adding at index 0 (could be anywhere now that i think about it) would break the loop or not as the no. of element increases while iterating through the list
        // Spoilers: It does. gives Exception in thread "main" java.util.ConcurrentModificationException
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for (String s:list) {
            list.add(s+0);
        }
        System.out.println(list);
    }
}
