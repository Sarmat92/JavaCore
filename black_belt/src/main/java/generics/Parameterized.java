package generics;

public class Parameterized {
    public static void main(String[] args) {
//
//        Info info = new Info<>("Hello");
//        Info info1 = new Info<>(25);
//
//        System.out.println(info);
//        System.out.println(info1);
//
//        System.out.println(info.getValue());
//        System.out.println(info1.getValue());
//
//        String s = (String) info.getValue();
//        Integer i = (Integer) info1.getValue();


    }
}

class Info<T extends Number> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }
}
