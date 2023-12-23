package generics.chatgpt.genericmethod;

import java.util.Arrays;
import java.util.List;


// 2. Generic Method:

public class Utils {
    public static <T> T getLastElement(List<T> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        return null;
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Integer lastInt = getLastElement(intList);
        System.out.println(lastInt);

        List<String> stringList = Arrays.asList("apple", "orange", "banana");
        String lastString = getLastElement(stringList);
        System.out.println(lastString);
    }

}

