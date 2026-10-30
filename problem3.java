
import java.util.*;

class problem3 {
    public static void main(String[] args) {

        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        // Store elements of arr1 in HashSet
        for (int num : arr1) {
            set.add(num);
        }

        // Find common elements
        HashSet<Integer> intersection = new HashSet<>();

        for (int num : arr2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        // Print intersection
        System.out.println("Intersection: " + intersection);
        System.out.println("Count: " + intersection.size());
    }
}
