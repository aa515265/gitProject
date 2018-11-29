package factory;

/**
 * Created by gawen on 2018/11/29.
 */
public class Cat implements Animal {
    @Override
    public void getName() {
        System.out.println("I am cat");
    }
}