package factory;

/**
 * Created by gawen on 2018/11/29.
 */
public class AnimalFactory {
    public Animal getAnimal(String animal){
        if(animal == null){
            return null;
        }
        if(animal.equalsIgnoreCase("dog")){
            return new Dog();
        }else if(animal.equalsIgnoreCase("cat")){
            return new Cat();
        }else if(animal.equalsIgnoreCase("bird")){
            return new Bird();
        }
        return null;
    }
}