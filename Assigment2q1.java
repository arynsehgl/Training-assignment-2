import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assigment2q1 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        List<Integer> list = convertArrayToList(array);
        System.out.println("ArrayList: " + list);
    }

    public static List<Integer> convertArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }
}
