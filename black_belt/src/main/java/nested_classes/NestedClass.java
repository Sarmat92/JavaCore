package nested_classes;

public class NestedClass {
    static class A{}  // nested class
    class B{}    // inner class

    void method(){
        class C{}  // local class
    }
}
