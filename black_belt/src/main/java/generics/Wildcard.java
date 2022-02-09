package generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {

        List<?> list1 = new ArrayList<>();

        List<String> stringList = new ArrayList<>();
        stringList.add("gvhb");
        stringList.add("l;kj");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(15);

        showList(stringList);
        showList(integerList);
    }

    public static void showList(List<?> list){
        System.out.println("List have: " + list);
    }
}
