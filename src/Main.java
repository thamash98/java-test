import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //problem1
        int[] arr = {2, 5, 6, 15, 10};
        problem1.sum(arr);

        //problem2
        String[] arr1 = {"a","b","c"};
        int[] arr2 = {1,2,3};
        problem2.merge(arr1,arr2);

        //problem3
        problem3.findFibonacciSeries(100);

        //problem4
        List<Integer> list = Arrays.asList(50, 2, 1, 9);
        String largestnum = problem4.largestPossible(list);
        System.out.println(largestnum);
    }
}