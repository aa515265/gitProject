package factory;

/**
 * Created by gawen on 2018/11/29.
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal animal = factory.getAnimal("cat");
        animal.getName();
    }
}