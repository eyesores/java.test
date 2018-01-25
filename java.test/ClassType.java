/**
 * 关于class类的练习
 */

public class ClassType {

    static Class c1 = ClassType.getClass();

    Class c2 = Class.forName("ClassType");

    Class c3 = Test.class;

    public static void main(String[] args) {

        System.out.println(c1 + c2 + c3);

    }

}

class Test {

    int num;

    public void said() {

        System.out.println("this is my type");
    }
}