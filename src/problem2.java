import java.util.ArrayList;
import java.util.List;

public class problem2 {
    public static void merge(String[] arr1, int[] arr2){
        List list = new ArrayList<>();
        for (int i = 0; i < arr1.length;i++){
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length;i++){
            list.add(arr2[i]);
        }
        System.out.println("merge array :" +list.toString());
    }
}
