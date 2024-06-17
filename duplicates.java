import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 5, 1, 4, 3, 5, 5, 6};
        
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : a) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}
