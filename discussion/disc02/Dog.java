package disc02;

/**
 * @author created by sunjy on 10/3/24
 */
public class Dog {

    public Dog(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    public Dog() {

    }

    private String name;

    private Integer size;

    public void bark(int size) {
        while (size > 0) {
            System.out.println("Woof");
            size = size - 1;
        }

    }
}
