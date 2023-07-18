import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class problem4 {
    public static String largestPossible(List<Integer> list){

        Collections.sort(list,(a, b)->(String.valueOf(b)+a).compareTo(String.valueOf(a)+b));
        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));
    }
}
