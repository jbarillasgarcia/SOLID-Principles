package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.problem;

public class ZooKeeper {
    
    private Dog dog = new Dog();
    private Rabbit rabbit = new Rabbit();

    public void moveAnimals() {
        dog.walk();
        rabbit.jump();
    }
    
}
