interface Productable {
    public void info();
}

class Pen implements Productable {
    public void info() {
        System.out.println("I am pen");
    }
}

class Book implements Productable {
    public void info() {
        System.out.println("I am pen");
    }
}

abstract class MyFactory {

    public abstract Productable createObj(String objName);

}

class SimpleFactory extends MyFactory {

    public Productable createObj(String objName) {

        if (objName.equals("pen")) {

            return new Pen();
        } else {
            return new Book();
        }

    }
}

public class FactoryTest {

    public static void main(String[] args) {

        MyFactory factory = new SimpleFactory();

        Productable p = factory.createObj("pen");

        p.info();

    }

}
