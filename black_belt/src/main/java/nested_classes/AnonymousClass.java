package nested_classes;

public class AnonymousClass {
    public static void main(String[] args) {

        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        System.out.println(m.doOperation(5, 6));
    }
}


interface Math {
    int doOperation(int a, int b);
}
