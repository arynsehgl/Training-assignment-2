import java.util.ArrayList;
import java.util.List;

public class Assignment3q3 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> result = joinLists(list1, list2);
        System.out.println(result);
    }

    public static List<Integer> joinLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }
}
