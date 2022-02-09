package generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {

        GetMethod getMethod = new GetMethod();

          ArrayList<Integer> integerArrayList = new ArrayList<>(); // так видит компилятор
        //ArrayList integerArrayList = new ArrayList();             так види GVM

          int a = integerArrayList.get(0);
        //int a = (Integer)integerArrayList.get(0);





        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("One");
        stringArrayList.add("two");
        stringArrayList.add("three");

        System.out.println(getMethod.getSecondElement(integerArrayList));
        System.out.println(getMethod.getSecondElement(stringArrayList));
    }
}

class GetMethod {
    public <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }
}
