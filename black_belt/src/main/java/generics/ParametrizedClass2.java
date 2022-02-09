package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {

        Pair<String> pair1 = new Pair<>("I have", "moon");
        Pair<Integer> pair2 = new Pair<>(18, 3);

        System.out.println("First value: " + pair1.getFirsValue1() + " Second value: " + pair1.getSecondValue2());
        System.out.println("First value: " + pair2.getFirsValue1() + " Second value: " + pair2.getSecondValue2());
    }
}

class Pair<V> {

    private V value1;
    private V value2;

    public Pair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirsValue1() {
        return value1;
    }

    public V getSecondValue2() {
        return value2;
    }
}
