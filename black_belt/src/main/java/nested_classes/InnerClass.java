package nested_classes;

public class InnerClass {

    public String color;
    public int dorCount;
    public Engine engine;

    public InnerClass(String color, int dorCount, int horsPower) {
        this.color = color;
        this.dorCount = dorCount;
        this.engine = this.new Engine(horsPower); //двигатель inner класса Engine создаётся во внешнем класса
    }

    public String getColor() {
        return color;
    }

    public int getDorCount() {
        return dorCount;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "InnerClass{" +
                "color='" + color + '\'' +
                ", dorCount=" + dorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {

        private int horsPower;

        public Engine(int horsPower) {
            this.horsPower = horsPower;
        }

        public int getHorsPower() {
            return horsPower;
        }

        public void setHorsPower(int horsPower) {
            this.horsPower = horsPower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsPower=" + horsPower +
                    '}';
        }
    }
}

class TestClass {
    public static void main(String[] args) {
        InnerClass car = new InnerClass("Black", 4, 155);
        System.out.println(car);
    }
}
