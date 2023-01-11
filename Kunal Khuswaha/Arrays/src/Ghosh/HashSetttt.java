package Ghosh;
import java.util.HashSet;

public class HashSetttt {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();
        set.add("hey");
        set.add("welcome");
        set.add("tech");
        set.add("world");

        System.out.println("HashSet: " + set);
        System.out.println("Is the set empty: " + set.isEmpty());

        set.clear();
        System.out.println("Is the set empty: " + set.isEmpty());
    }
}
