package pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        for (List<Integer> innerList : generate(10)) {
            System.out.println(innerList);
        }
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>(numRows);

        List<Integer> list1 = List.of(1);
        result.add(list1);

        if (numRows == 1) {
            return result;
        }

        List<Integer> list2 = List.of(1, 1);
        result.add(list2);

        if (numRows == 2) {
            return result;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> list = new ArrayList<>(i + 1);
            list.add(1);
            List<Integer> previousList = result.getLast();
            for (int j = 0; j < i / 2; j++) {
                int sum = previousList.get(j) + previousList.get(j + 1);
                list.add(sum);
            }
            int len = (i + 1) / 2;
            for (int j = len - 1; j >= 0; j--) {
                list.add(list.get(j));
            }
            result.add(list);
        }

        return result;
    }
}
