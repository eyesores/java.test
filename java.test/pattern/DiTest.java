class House {
    String name;

    public void live(Human person) {

        person.setName("josh");
        person.setSex('m');

        System.out.println("name:" + person.getName() + "\nsex:" + person.getSex());

    }
}

public class DiTest {

    public static House h = new House();
    public static Human p = new Human();

    public static void main(String[] args) {
        h.live(p);

    }

}

class Human {

    String name;
    char sex;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * @return the sex
     */
    public char getSex() {
        return sex;
    }
}