import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment2q4 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the arraylist: ");
        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }

        System.out.println("Original arraylist: " + nums);
        reverseArrayList(nums);
        System.out.println("Reversed arraylist: " + nums);
        sortArrayList(nums);
        System.out.println("Sorted arraylist: " + nums);
        removeElements(nums);
        System.out.println("Arraylist after removing elements: " + nums);
    }

    public static void reverseArrayList(ArrayList<Integer> nums) {
        Collections.reverse(nums);
    }

    public static void sortArrayList(ArrayList<Integer> nums) {
        Collections.sort(nums);
    }

    public static void removeElements(ArrayList<Integer> nums) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements to be removed: ");
        while (sc.hasNextInt()) {
            int elem = sc.nextInt();
            if (nums.contains(elem)) {
                nums.remove(nums.indexOf(elem));
            }
        }
    }
}
